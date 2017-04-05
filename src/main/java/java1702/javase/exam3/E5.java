package java1702.javase.exam3;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/4/1.
 * java
 */
public class E5 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6,};
//        int[]b={6, 5, 4, 3, 2, 1,};

        int[] b = new int[a.length];

        for (int x:a) {
            System.out.print(x + " ");
        }
        System.out.println();



        for (int i = 0; i < a.length; i++) {

            b[i] = a[i];
        }


        for (int x : a) {
            System.out.print(a + " ");
            System.out.println(b);
        }
//
    }
}
