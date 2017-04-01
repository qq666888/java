package java1702.javase.exercise;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/3/31.
 * java
 */
public class StringCopyTest {
    public static void main(String[] args) {//size长度
        int[] srcArray={1,2,3,4,5,6};//源
        int[] destArray=new int[10];//目的地
        System.out.println(Arrays.toString(destArray));
        System.arraycopy(srcArray,1,destArray,6,4);
        System.out.println(Arrays.toString(destArray));

        String[]strings={"a","b","c","d",null,null,null,null,null,null};
        System.arraycopy(strings,3,strings,2,2);
        System.out.println(Arrays.toString(strings));


    }
}
