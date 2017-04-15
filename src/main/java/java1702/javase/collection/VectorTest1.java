package java1702.javase.collection;

import java.util.Vector;

/**
 * Created by $qiqi
 * on 2017/4/13.
 * java
 */
public class VectorTest1 {
    public static void main(String[] args) {

        Vector<String>vector=new Vector<>();
        vector.add("123");
        vector.add("456");
        vector.add("789");
        vector.add("ture");
        String s=vector.get(3);

        System.out.println(s);
    }
}
