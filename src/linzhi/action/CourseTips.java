package linzhi.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by wanglinzhizhi on 15-4-15.
 */
public class CourseTips extends ActionSupport {

    private String classTime;  //classTimeNum

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    @Override
    public String execute() throws Exception {

        System.out.println("classTime_CourseTips : "+classTime);

        String realclassTime=null;


        if (classTime.equals("9")) {
            realclassTime = "Monday Morning #1";
        } else if (classTime.equals("10")) {
            realclassTime = "Thesday Morning #1";
        } else if (classTime.equals("11")) {
            realclassTime = "Wenday Morning #1";
        } else if (classTime.equals("12")) {
            realclassTime = "Thursday Morning #1";
        } else if (classTime.equals("13")) {
            realclassTime = "Friday Morning #1";
        } else if (classTime.equals("14")) {
            realclassTime = "Saturday Morning #1";
        } else if (classTime.equals("15")) {
            realclassTime = "Sunday Morning #1";
//                case "16":realclassTime="Monday Morning #1";break;
        } else if (classTime.equals("17")) {
            realclassTime = "Monday Morning #2";
        } else if (classTime.equals("18")) {
            realclassTime = "Thesday Morning #2";
        } else if (classTime.equals("19")) {
            realclassTime = "Wenday Morning #2";
        } else if (classTime.equals("20")) {
            realclassTime = "Thursday Morning #2";
        } else if (classTime.equals("21")) {
            realclassTime = "Friday Morning #2";
        } else if (classTime.equals("22")) {
            realclassTime = "Saturday Morning #2";
        } else if (classTime.equals("23")) {
            realclassTime = "Sunday Morning #2";
//                case "24":realclassTime="Monday Morning #1";break;
        } else if (classTime.equals("25")) {
            realclassTime = "Monday Afternoon #1";
        } else if (classTime.equals("26")) {
            realclassTime = "Thesday Afternoon #1";
        } else if (classTime.equals("27")) {
            realclassTime = "Wenday Afternoon #1";
        } else if (classTime.equals("28")) {
            realclassTime = "Thursday Afternoon #1";
        } else if (classTime.equals("29")) {
            realclassTime = "Friday Afternoon #1";
        } else if (classTime.equals("30")) {
            realclassTime = "Saturday Afternoon #1";
        } else if (classTime.equals("31")) {
            realclassTime = "Sunday Afternoon #1";
//                case "32":realclassTime="Monday Morning #1";break;
        } else if (classTime.equals("33")) {
            realclassTime = "Monday Afternoon #2";
        } else if (classTime.equals("34")) {
            realclassTime = "Thesday Afternoon #2";
        } else if (classTime.equals("35")) {
            realclassTime = "Wenday Afternoon #2";
        } else if (classTime.equals("36")) {
            realclassTime = "Thursday Afternoon #2";
        } else if (classTime.equals("37")) {
            realclassTime = "Friday Afternoon #2";
        } else if (classTime.equals("38")) {
            realclassTime = "Saturday Afternoon #2";
        } else if (classTime.equals("39")) {
            realclassTime = "Sunday Afternoon #2";
//                case "40":realclassTime="Monday Morning #1";break;
        } else if (classTime.equals("41")) {
            realclassTime = "Monday Evening #1";
        } else if (classTime.equals("42")) {
            realclassTime = "Thesday Evening #1";
        } else if (classTime.equals("43")) {
            realclassTime = "Wenday Evening #1";
        } else if (classTime.equals("44")) {
            realclassTime = "Thursday Evening #1";
        } else if (classTime.equals("45")) {
            realclassTime = "Friday Evening #1";
        } else if (classTime.equals("46")) {
            realclassTime = "Saturday Evening #1";
        } else if (classTime.equals("47")) {
            realclassTime = "Sunday Evening #1";
//                case "48":realclassTime="Monday Morning #1";break;
        } else if (classTime.equals("49")) {
            realclassTime = "Monday Evening #2";
        } else if (classTime.equals("50")) {
            realclassTime = "Thesday Evening #2";
        } else if (classTime.equals("51")) {
            realclassTime = "Wenday Evening #2";
        } else if (classTime.equals("52")) {
            realclassTime = "Thursday Evening #2";
        } else if (classTime.equals("53")) {
            realclassTime = "Friday Evening #2";
        } else if (classTime.equals("54")) {
            realclassTime = "Saturday Evening #2";
        } else if (classTime.equals("55")) {
            realclassTime = "Sunday Evening #2";
        } else {
        }

//        int a=Integer.parseInt(classTime);

        ActionContext.getContext().getSession().put("classTimeReal",realclassTime);
        ActionContext.getContext().getSession().put("classTimeNum",classTime);

        return SUCCESS;
    }
}
