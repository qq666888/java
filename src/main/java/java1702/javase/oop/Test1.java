package java1702.javase.oop;

import java.io.FileNotFoundException;

/**
 * Created by $qiqi
 * on 2017/4/18.
 * java
 */
public class Test1 {
    public static void method()throws NullPointerException {
        try {
            System.out.println("e");
            throw new FileNotFoundException();
//            System.out.println("f");
        }catch (Exception e){
            System.out.println("g");
        }finally {
            System.out.println("h");
        }
        System.out.println("i");

    }

    public static void main(String[] args) {
        try{
            method();
            System.out.println("a");
        }
        catch (NullPointerException e){
            System.out.println("b");
        }finally {
            System.out.println("c");
        }
        System.out.println("d");
    }
}
