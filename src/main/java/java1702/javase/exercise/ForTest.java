package java1702.javase.exercise;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by $qiqi
 * on 2017/3/23.
 * java
 */
public class ForTest {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j =i; j <=5; j++) {
                System.out.print("@");

            }
            System.out.println();

        }
        System.out.println("----------------");
     //   打印九九乘法表
        //public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {//外循环控制行，内循环控制列
            for (int j = 1; j <=i; j++) {//三角行尖朝上，可以改变条件，让条件随着外循环变化；
                // 三角形尖朝下，可以改变初始化值，让初始化值随着外循环变化
                System.out.print(j+"*"+i+"="+j*i+"\t");

            }
            System.out.println();//换行，每执行完一次外循环，换行一次

        }
    }


}
