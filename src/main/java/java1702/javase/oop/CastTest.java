package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/27.
 * java
 */
public class CastTest {
    public static void main(String[] args) {
        int x=1;

        String s1=String.valueOf(x);
        System.out.println(s1);
        String s2="123";
        int y1=Integer.valueOf(s2);
        System.out.println(y1);
    }
}
