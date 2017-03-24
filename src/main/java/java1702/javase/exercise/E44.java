package java1702.javase.exercise;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/3/21.
 * java
 *///一个偶数总能表示为，两个素数之和
public class E44 {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于2的偶数");
        int a = scanner.nextInt();
        if (a %2!=0) {
            System.out.println(a);
        }
        int b = scanner.nextInt();
        if (b %2!=0) {
            System.out.println(b);
        }
//        int i;
//        int j;
//        for (i = 2;i%2!=0;i++) {
//            System.out.println(i);
//
//        for (j = 2; j%2!=0; j++) {
//            System.out.println(j);
//        }
//            System.out.println("请输入一个大于2的偶数="+i+j);
//        }
//


    }
}
