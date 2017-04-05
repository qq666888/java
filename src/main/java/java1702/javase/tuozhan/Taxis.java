package java1702.javase.tuozhan;

import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//在主方法中创建一维数组，进行排序后输出
public class Taxis {
    public static void main(String[] args) {
        int[]arr={45,38,94,2,3,1};
        System.out.println("输出原数组是：");
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];

            System.out.print(arr[i]+"\t");
        }
            Arrays.sort(arr);//将数组进行排序
            System.out.println("输出排序后数组是：");
            for (int i = 0; i < arr.length; i++) {
                int i2 = arr[i];
                System.out.print(arr[i]+"\t");
            }

        
    }
}
