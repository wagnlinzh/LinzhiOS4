package linzhi.service.impl;


import linzhi.DAO.UserDAO;
import linzhi.DAO.impl.ScoreManagerDAOImpl;
import linzhi.service.SigninService;

/**
 * Created by wanglinzhizhi on 15-3-20.
 */
public class SigninServiceImpl implements SigninService {
//    UserDAO userDAO = new UserDAOImpl();
    private UserDAO userDAO;
    private ScoreManagerDAOImpl scoreManagerDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


//    @Override
//    public boolean isSignin(Student student) {
//        if (userDAO.check(student)){
//            return true;
//        }
//
//        return false;
//    }

//    @Override  fot test
//    public boolean isSignin(String email, String password) {
//        if (userDAO.check(email, password)){
//            return true;
//        }
//        return false;
//
//        if ("abc@me.com".equals(username) && "123".equals(password)) {
//            return true;
//        }
//
//        return false;
//    }


    @Override
    public boolean isSignin(String email, String password) {
        if (userDAO.check(email,password)){
            return true;
        }
        return false;
    }


    public void setScoreManagerDAO(ScoreManagerDAOImpl ScoreManagerDAO) {
        scoreManagerDAO = ScoreManagerDAO;
    }

    public ScoreManagerDAOImpl getScoreManagerDAO() {
        return scoreManagerDAO;
    }
}
