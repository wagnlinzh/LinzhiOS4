package linzhi.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import linzhi.bean.Score;
import linzhi.bean.Student;
import linzhi.service.ListAllScoreService;
import linzhi.service.impl.ListAllScoreServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by wanglinzhizhi on 15-4-8.
 */
public class checkGradeJspAction extends ActionSupport {



    @Override
    public String execute() throws Exception {

        System.out.println("===============3==================");
        Student student= (Student)ActionContext.getContext().getSession().get("userInfo");
        System.out.println("id="+ student.getId());
        System.out.println("name is "+ student.getName());
        System.out.println("email is "+ student.getEmail());

        String email= student.getEmail();




        ListAllScoreService listAllScoreService=new ListAllScoreServiceImpl();


        List<Score> list= listAllScoreService.listAllScore(email);

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("list",list);

        return SUCCESS;
    }
}
