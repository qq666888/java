/**
 * Created by SONY on 2017/3/8.
 */
public class IFTest {
    public static void main(String[] args) {
        int grade =60;//成绩
        if (grade>=95) {
            System.out.println("优秀");
        }
        else if(grade>=85){//否则
            System.out.println("良好");
        }
        else  if(grade>=60){
            System.out.println("及格");
        }
        else
            System.out.println("不及格");



    }
}
