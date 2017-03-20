package java1702.javase.exam;

import java.util.Scanner;

/**
 * Created by SONY on 2017/3/18.
 */
public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入球的半径:");
        double r = sc.nextDouble();
        double u = 4.0 / 3.0 * 3.14 * r * r * r;
        System.out.println(u);
    }
}
