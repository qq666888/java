package java1702.javase.exam3;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/4/1.
 * java
 */
public class E1 {
    public static void main(String[] args) {
        int[][] ints = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print("请输入第" + i + "行，第" + j + "个数的值：");
                ints[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }
        int zhuduijiao = 0;
        for (int i = 0; i < ints.length; i++) {
            zhuduijiao *= ints[i][i];
        }
        System.out.println("主对角线上元素的乘积为：" + zhuduijiao);
        int fuduijiao = 0;
        for (int i = 0; i < ints.length; i++)
            {
                fuduijiao *= ints[i][4 - i];
            }
            System.out.println("副对角线上元素的乘积为：" + fuduijiao);


    }
}
