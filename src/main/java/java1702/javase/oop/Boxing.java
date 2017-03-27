package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/27.
 * java
 */
public class Boxing {
    public static void main(String[] args) {
        Long sun=0L;
        Long start=System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sun+=i;

        }
        System.out.println("time: "+(System.currentTimeMillis()));
        System.out.println("sun: "+sun);
    }
}
