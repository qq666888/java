package java1702.javase.exam;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/3/21.
 * java
 */
//随机生成一个整数，100小了，1000小了，100000大了，10000对了
public class EE1 {
    private static int x;
    private static int counter;
    public static void main(String[] args) {
        Random random = new Random();//随机
        x = random.nextInt();
        System.out.println();
        guess();//猜测；推测

    }

    private static void guess() {
        System.out.println("随机输入一个整数");
        Scanner scanner=new Scanner(System.in);//Scanner扫描,System.in控制台输入
        int y=scanner.nextInt();
        if (y >x) {
            System.out.println("大了");
            counter++;
            guess();


        }else if(y<x){
            System.out.println("小了");
            counter++;
            guess();
        } else if (y == x) {
            System.out.println("对了");
            counter++;
            guess();
        } else {
            System.out.println("error");
            return;
        }
    }
}
