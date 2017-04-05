package java1702.javase.tuozhan;

import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//在主方法中创建一个一维数组，并实现通过fill（）方法填充数组元素，最后将数组中的各个元素输出
public class Swap {
    public static void main(String[] args) {
        int[]arr=new int[5];
        Arrays.fill(arr,8);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println("第"+(i+1)+"个元素是"+arr[i]);
            
        }
    }
}
