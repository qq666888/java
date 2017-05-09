package java1702.javase.exam7;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/5/6.
 * java
 */
public class E1 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩");
        Scanner scanner=new Scanner(System.in);
        int grade=scanner.nextInt();
        if (grade>=90&grade<=100) {
            System.out.println("优秀");
        }
        else if(grade>=80&grade<=89){//否则
            System.out.println("良好");
        }
        else  if(grade>=70&grade<=79){
            System.out.println("中等");
        }
        else  if(grade>=60&grade<=69){
            System.out.println("及格");
        }
        else  if(grade>=0&grade<=59){
            System.out.println("不及格");
        }
        else
            System.out.println("成绩输入有误");

    }
}
