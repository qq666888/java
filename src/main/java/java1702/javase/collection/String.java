package java1702.javase.collection;

/**
 * Created by $qiqi
 * on 2017/3/29.
 * java
 */
//public class String {
//    public String(char[] chars) {
//    }
////    public String(char[] chars) {
////    }
//
//    public static void main(String[] args) {
//        java.lang.String s = "           hello                   world! test    ";
//        // match 匹配\ [mætʃ]
//        System.out.println(s.matches("\\w+")); // JavaScript
////        System.out.println(s.contains("he"));
//        System.out.println(s.equals("hello"));
//        // repalce 取代\ [rɪ'pleɪs]
////        System.out.println(s.replace("l", "a"));
//        System.out.println(s.replaceAll("ll", "a"));
////        System.out.println(s.replaceAll("[l]+", "a"));
//        System.out.println(s.replaceFirst("ll", "a"));
//        // split 分裂\ [splɪt]
//        java.lang.String[] strings = s.split("\\s+"); // space 空格
//        System.out.println(strings.length); // 10 12 11
//        for (java.lang.String string : strings) {
//            System.out.println(string);
//        }
////        System.out.println("boo:and:foo".split("o", 4).length);
//
//        for (java.lang.String o : "boo:and:foo".split("o", -10)) { // ?
//            System.out.println("'" + o + "'");
//        }
//        System.out.println(s.substring(s.indexOf('w')));
//        System.out.println(s.trim()); // trim 修剪\ [trɪm]
//        System.out.println(s.replace(" ", ""));
//
////        System.out.println(String.valueOf(123));
//        System.out.println("----------");
//
//        java.lang.String s1 = "hello";
////        String s2 = new String(s1);//"hello";
//        System.out.println(s1);
////        System.out.println(s2);
////        System.out.println(s1.equals(s2));
////        System.out.println(s1 == s2);
//
//        java.lang.String s3 = "hello";
//        System.out.println(s1 == s3);
//
//        /*
//        String pool 池\ [puːl] 字符串池
//        s1---
//            |
//        -----------------------
//        |  "hello"   "hello"    |
//        |  "test..." "test" "hi"|
//        -----------------------
//            C memory leak 内存泄露  pointer 指针
//            Java gc garbage collection 垃圾回收机制
//         */
//
//        // immutable 不可变的
//        java.lang.String string = "test...";
//        System.out.println(string);
//        string = "test";
//        string = "hi";
//        System.out.println(string); // ?
//
////        System.gc();
//    }
//}
