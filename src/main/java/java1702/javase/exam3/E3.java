package java1702.javase.exam3;

/**
 * Created by $qiqi
 * on 2017/4/1.
 * java
 */
public class E3 {
    public static void main(String[] args){
        String sr = "abcdrfnaaajchxgafndj";
        String ar = "a";

        System.out.println("a"+search(sr,ar)+",");
    }

    public static int search(String sr,String ar){
        int a = sr.length();
        int b= sr.replaceAll(ar,"").length();
        return a- b;
    }
}
