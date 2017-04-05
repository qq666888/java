package java1702.javase.tuozhan;

import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
public class Displace {
    public static void main(String[] args) {

        int[]arr={45,12,10,1,2};
        Arrays.fill(arr,1,2,3);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            System.out.println(args[i]);

        }
    }
}
