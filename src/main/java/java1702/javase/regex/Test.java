package java1702.javase.regex;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by $qiqi
 * on 2017/4/27.
 * java
 */
public class Test {
    public static void main(String[] args) {
//        pattern模式  matcher匹配
        Pattern pattern=Pattern.compile("e");//js var=pattern=/e/;

        Matcher matcher=pattern.matcher("hello");
//        System.out.println(matcher.find());
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
