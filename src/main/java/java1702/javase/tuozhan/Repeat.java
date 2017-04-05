package java1702.javase.tuozhan;

import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//在方法中创建一维数组，并将数组中索引位置0-3之间的元素复制到新数组中，并打印出新数组
public class Repeat {
    public static void main(String[] args) {
        int[]arr={3,25,45,6,7,8};
        System.out.println("原数组是：");
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println(arr[i]);
        }
            int [] newarry= Arrays.copyOfRange(arr,0,3);//复制数组
            System.out.println("新数组是：");
            for (int j = 0; j < newarry.length; j++) {
                int i2 = newarry[j];
                System.out.println(newarry[j]);

            }

    }
}
