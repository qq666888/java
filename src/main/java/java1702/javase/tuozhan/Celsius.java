package java1702.javase.tuozhan;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/4/6.
 * java
 */
//将摄氏温度转为华氏温度
public class Celsius {
    public double getFaser(double ce){
        double faser=1.8*ce+32;
        return  faser;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("输入要转换的温度："+"单位摄氏度");
        double ce=scanner.nextDouble();
        Celsius conver=new Celsius();
        double faser=conver.getFaser(ce);
        System.out.println(false);
    }
}
