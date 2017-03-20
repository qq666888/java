package java1702.javase.basic;

import  java.util.Scanner;
/**
 * Created by SONY on 2017/3/10.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        /*int i = 2;
        switch (i) {//开关
            case 90://情况下
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
                default://默认的，缺省的
                    System.out.println("default...");
                break;
        }*/
        Scanner scanner = new Scanner(System.in);//扫描器
        System.out.println("input A B C D:");
        String s = scanner.nextLine();
        System.out.println(s);

         switch (s) {
             case "A":
                 System.out.println("i>=90");
                 break;
             case "B":
                 System.out.println("i>=85");
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
