package java1702.javase.basic;

import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * Created by SONY on 2017/3/10.
 */
public class ForOuter {
    public static void main(String[] args) {
        // 嵌套
        outer: // label: 标签\ ['leɪb\(ə\)l] break to this position
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break outer;
                }
                System.out.println("\tj:" + j);
            }
        }

        System.out.println(1d - .9d); // float point
    }
}


