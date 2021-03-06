package linzhi.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import linzhi.bean.Course;
import linzhi.bean.Student;
import linzhi.service.ManagerService;
import linzhi.service.impl.ManagerServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanglinzhizhi on 15-4-8.
 */
public class checkGradeJspAction extends ActionSupport {

    private ManagerService managerService;

    public ManagerService getManagerService() {
        return managerService;
    }

    public void setManagerService(ManagerService managerService) {
        this.managerService = managerService;
    }

    @Override
    public String execute() throws Exception {

        System.out.println("===============3==================");
        Student student = (Student) ActionContext.getContext().getSession().get("userInfo");
        System.out.println("email is " + student.getEmail());

        String email = student.getEmail();


//      课程名称
//        ListAllCourseService listAllCourseService = new ListAllCourseServiceImpl();

//        List<Course> courseList = listAllCourseService.listAllCourseService(email);
        List<Course> courseList = managerService.listAllCourseService(email);


//      分数
//        ListAllScoreService listAllScoreService = new ListAllScoreServiceImpl();
//
//        List<Integer> scoreList = listAllScoreService.listAllScore(email);

        List<Integer> scoreList = managerService.listAllScore(email);


        Map map = new HashMap();

        for (int i = 0; i < scoreList.size(); i++) {

            String courseName = courseList.get(i).getName();
            int course_score = (int) scoreList.get(i);
            map.put(courseName, course_score);

        }

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("couse_scroe", map);

        request.setAttribute("CourseList", courseList);
//
        request.setAttribute("ScoreList", scoreList);


        return SUCCESS;
    }


    //    for test
    public static void main(String[] args) {
        String email = "alan@me.com";
        ManagerService managerService = new ManagerServiceImpl();
//      课程名称
//        ListAllCourseService listAllCourseService = new ListAllCourseServiceImpl();
//
//        List<Course> courseList = listAllCourseService.listAllCourseService(email);


        List<Course> courseList = managerService.listAllCourseService(email);


//      分数
//        ListAllScoreService listAllScoreService = new ListAllScoreServiceImpl();
//
//        List<Integer> scoreList = listAllScoreService.listAllScore(email);
        List<Integer> scoreList = managerService.listAllScore(email);

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < courseList.size(); i++) {

            String courseName = courseList.get(i).getName();
            int course_score = scoreList.get(i);
            System.out.println(courseName);
            System.out.println(course_score);
            map.put(courseName, course_score);


        }


        for (int i = 0; i < map.size(); i++) {
            int scoure = (int) map.get(courseList.get(i).getName());
            System.out.println("couserName:" + courseList.get(i).getName() + " >>>>>>>>>>" +
                    "scoure: " + scoure);

        }
    }

}