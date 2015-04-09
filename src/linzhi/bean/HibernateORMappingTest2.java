package linzhi.bean;

/**
 * Created by wanglinzhizhi on 15-4-4.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

public class HibernateORMappingTest2 {

    private static SessionFactory sessionFactory;

    @BeforeClass
    public static void beforeClass() {
        //new SchemaExport(new AnnotationConfiguration().configure()).create(false, true);
        //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        Configuration configuration = new Configuration();
        configuration.configure();

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);


    }

    @AfterClass
    public static void afterClass() {
        sessionFactory.close();
    }

    @Test
    public void testSave(){
//        Student stu = new Student();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student stu= (Student)session.createQuery("from Student s where s.email = ?").setString(0,"alan@me.com")
                .uniqueResult();
//        stu.setName("alan");
//        stu.setEmail("alan@me.com");
//        stu.setPassword("alan");

        Course c = new Course();
        c.setName("政治：近代史");

        Score score = new Score();
        score.setStudent(stu);
        score.setCourse(c);
        score.setScore(95);



        session.save(stu);
        session.save(c);
        session.save(score);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testLoad(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        Student stu = (Student)session.createQuery("from Student stu where stu.email = ?")
                .setString(0,"alan@me.com")
                .uniqueResult();

        System.out.println(stu.getName());

        for(Course course:stu.getCourses()){
            System.out.println(course.getName());
        }

        for (Score score:stu.getScores()) {
            System.out.println(score.getScore());
        }
        session.getTransaction().commit();
        session.close();

        System.out.println("==========================================================");

        List<Map> list=null;

        Map<String,Integer> course_score_Map = new HashMap<>();
        Set<Score> scoreSet=stu.getScores();
        Set<Course> courseSet=stu.getCourses();

        Iterator courseIterator= courseSet.iterator();
        Iterator scoreIterator=scoreSet.iterator();

        while (scoreIterator.hasNext()&&courseIterator.hasNext()){
            Course course=(Course)courseIterator.next();
            Score score=(Score)scoreIterator.next();
            course_score_Map.put(course.getName(),score.getScore());
            list.add(course_score_Map);
        }

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }


    @Test
    public void testUpdate(){
        Session s = sessionFactory.openSession();
        s.beginTransaction();
        Student stu = (Student)s.get(Student.class, "ff8080814c84ccb2014c84ccb4bb0000");
        s.getTransaction().commit();
        s.close();

        stu.setName("Tom");

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(stu);
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testDeleteStudent(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student stu = (Student)session.get(Student.class, "ff8080814c84ccb2014c84ccb4bb0000");
        session.delete(stu);
        session.getTransaction().commit();
        session.close();
    }

}
