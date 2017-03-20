package java1702.javase.exercise;
import java1702.javase.oop.DefaultClass;

/**
 * Created by $qiqi
 *on 2017/3/14.
 */
public class
E9 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            int c = 0;
            for (int j = 1; j < i; j++)
                if (i % j == 0) c += j;
            if (c == i) {
                System.out.println(i);
                DefaultClass defaultClass = new DefaultClass();
                System.out.println(defaultClass.toString());

            }
        }

    }
}
