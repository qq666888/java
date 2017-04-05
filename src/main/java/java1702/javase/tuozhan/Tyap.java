package java1702.javase.tuozhan;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//定义二维数组，实现将二维数组元素输出
public class Tyap {
    public static void main(String[] args) {
        int[][]arr={{1},{2,3},{4,5,6}};
//        for (int i = 0; i < arr.length; i++) {
//            int[] ints = arr[i];
//            for (int j = 0; j < ints.length; j++) {
//                int anInt = ints[j];
//                System.out.print(arr[i][j]+" ");
//
//            }
//            System.out.println(" ");
     //   方法二 foreach语句遍历二维数组
        for(int i[]:arr){
            for(int y:i){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        }
    }




