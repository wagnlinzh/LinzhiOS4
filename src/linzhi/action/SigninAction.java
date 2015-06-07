package linzhi.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import linzhi.Unit.EncryptUtil;
import linzhi.bean.Student;
import linzhi.service.SigninService;


/**
 * Created by wanglinzhizhi on 15-3-20.
 */
public class SigninAction extends ActionSupport {



    private String email;

    private String password;

    private SigninService signinService;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SigninService getSigninService() {
        return signinService;
    }

    public void setSigninService(SigninService signinService) {
        this.signinService = signinService;
    }


    @Override
    public void validate() {
        //做没有业务逻辑的验证,只进行的是输入验证

        System.out.println("validate innoked!算了，这里不做输入验证了，因为js已经完成了基本的输入验证");

        System.out.println("这里可以做业务逻辑的验证");
        System.out.println("student.getEmail()   "+email);
        System.out.println("student.getPassword()   "+password);
    }

    @Override
    public String execute() throws Exception {
    //这里可以做业务逻辑的验证

        System.out.println("这里可以做业务逻辑的验证");
        System.out.println("student.getEmail()   "+email);
        System.out.println("student.getPassword()   "+password);
//        System.out.println("student.getEmail()   " + student.getEmail());
//        System.out.println("student.getPassword()   " + student.getPassword());


        String emailMD5= EncryptUtil.md5Encrypt(email);
        System.out.println(email+">>>>>>>>>>>>>>>>>>>>>"+emailMD5);
        String passwordMD5=EncryptUtil.md5Encrypt(password);
        System.out.println(password+">>>>>>>>>>>>>>>>>>>>>"+passwordMD5);


        if (this.signinService.isSignin(email,password))
        {
            Student student1=new Student();
            student1.setEmail(email);
            student1.setPassword(password);


            ActionContext.getContext().getSession().put("userInfo",student1);

            return SUCCESS;
        }

        this.addActionError("用户名或密码错误");

        return INPUT;

    }



}
