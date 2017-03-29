package java1702.javase.collection;

import javax.print.attribute.standard.OrientationRequested;
import javax.sound.midi.Soundbank;

/**
 * Created by $qiqi
 * on 2017/3/28.
 * java
 */
public class StringTest {
    public static void main(String[] args) {
        String s="Hello";
        String s1=new String();
        System.out.println(s1);
        char[] chars={'H', 'e', 'l', 'l', 'o'};
        String s2=new String(chars);
        System.out.println(s2);

        for (char c : s2.toCharArray()) {
            System.out.println(c);
        }
        String s3="Hello";
        System.out.println(s3.charAt(0));
        System.out.println(s3.concat("123"));
        System.out.println(s3.contains("a"));
        System.out.println(s3.endsWith("aa"));
        System.out.println(s3.equals("a"));
        System.out.println(s3.equalsIgnoreCase("a"));
        System.out.println(String.format(s3, 2));
        System.out.println(s3.getBytes());
        System.out.println(s3.indexOf(2));


    }
//    private static String toLowerCase(String origin){
//        char[] chars= origin.toCharArray();
//        for(int i=0; i<chars.length;i++){
//            char aChar=chars[i];
//            if(aChar>='A'& aChar<='Z'){
//                chars[i]-=32;//a-A=32
//            }
//        }
//        return new String(chars);
//
//    }
//    private static String toUpperCase(String origin) {
//        char[] chars = origin.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            char aChar = chars[i];
//            if (aChar >= 'a' && aChar <= 'z') {
//                chars[i] -= 32; // a - A = 32
//            }
//        }
//        return new String(chars);
//    }
}
