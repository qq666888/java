package java1702.javase.collection;

import java.util.ArrayList;

/**
 * Created by $qiqi
 * on 2017/4/10.
 * java
 */
public class EnsureCapacityTest {
    private  static final  int N=1000000;

    public static void main(String[] args) {
        ArrayList<String>strings=new ArrayList<>();
        strings.ensureCapacity(N);//ensur保证
        long start=System.currentTimeMillis();
        for (int i = 0; i <N ; i++) {
            strings.add("hello");

        }
        System.out.println(System.currentTimeMillis()-start);


    }
}
