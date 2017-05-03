package java1702.javase.exam6;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by $qiqi
 * on 2017/4/22.
 * java
 */
public class E2 {
    public static void main(String[] args) {

        String s=null;
        try {
            System.out.println(s.toUpperCase());
        }catch(NullPointerException e){
            e.printStackTrace();

        }
    }
}
