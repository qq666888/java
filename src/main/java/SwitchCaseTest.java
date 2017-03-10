import  java.util.Scanner;
/**
 * Created by SONY on 2017/3/10.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        /*int i = 2;
        switch (i) {//开关
            case 0://情况下
                System.out.println("i = 0 ...");
                break;
            case 1:
                System.out.println("i = 1...");
                break;
                default://默认的，缺省的
                    System.out.println("default...");
                break;
        }*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D:");
        String s = scanner.nextLine();
        System.out.println(s);

         switch (s) {
             case "A":
                 System.out.println("i>=90");
                 break;
             case "B":
                 System.out.println("i>=80");
                 break;
             case "C":
                 System.out.println("i>=60");
                 break;
             case "D":
                 System.out.println("i<60");
                 break;
                 default:
                     System.out.println("default...");
                     break;
         }




    }
}
