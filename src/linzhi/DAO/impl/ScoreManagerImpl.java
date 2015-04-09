package linzhi.DAO.impl;

import linzhi.DAO.HibernateUtil.HibernateUtil;
import linzhi.DAO.ScoreManager;
import linzhi.bean.Course;
import linzhi.bean.Score;
import linzhi.bean.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.*;

/**
 * Created by wanglinzhizhi on 15-4-9.
 */
public class ScoreManagerImpl implements ScoreManager{
    private Session session;
    private Transaction transaction;

    public ScoreManagerImpl() {
        session = HibernateUtil.getSession();
    }

    @Override
    public List<Score> listAllScore(String email) {
        List<Score> list=null;
        try {
            transaction = session.beginTransaction();


//            Query query= session.createQuery("select sc.score from S_C sc where sc.S_id=(select id from Student stu where stu.email = ?)").setString(email);

//            list=query.list();


            Student stu = (Student)session.createQuery("from Student s where s.name = ?")
                    .setString(0, "alan")
                    .uniqueResult();


            Map<String, Integer> map=new HashMap<String,Integer>();

            Set<Course> courseSet = stu.getCourses();

            Iterator courseIterator=courseSet.iterator();

            Set<Score> scoreSet =stu.getScores();

            Iterator scoreIterator=scoreSet.iterator();



            while (courseIterator.hasNext()){
                System.out.println(courseIterator.next());
            }

            transaction.commit();
        } catch (HibernateException e) {
            HibernateUtil.rollback(transaction);
        } finally {
            HibernateUtil.closeSession();
        }
        return list;
    }
}
