package java1702.javase.oop;

import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//创建一个类，在主方法中声明二维矩阵，然后将此矩阵进行转置运算，
public class Arrayrow {
    public static void main(String[] args) {
        int[][]arr=new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("转置前的矩阵是");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");


            }
            System.out.println(" ");

        }
        int [][] arr2=new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=arr2[j][i];
//                System.out.println(arr2[j][i]);
                
            }
            
        }
        System.out.println("转置后的数组");


    }
}
