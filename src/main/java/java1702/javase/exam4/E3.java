package java1702.javase.exam4;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/**
 * Created by $qiqi
 * on 2017/4/8.
 * java
 */
public class E3 {
    public static void main(String[] args) {
            String str = "Hello World";
            String[] newStr = str.split(" ");
            for (int i = 0; i < newStr.length; i ++) {
                System.out.println(newStr[i]);
            }
            System.out.println("Hello".toUpperCase() + " " + "World".toLowerCase());
            String s2 = "20100110";

        SimpleDateFormat s3=new SimpleDateFormat("yyyy-MM-dd");
        s3.format(s2);
        System.out.println(s3);
        }
}
