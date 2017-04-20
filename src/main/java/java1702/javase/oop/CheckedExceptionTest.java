package java1702.javase.oop;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/4/17.
 * java
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        //抽取方法快捷键ctrl+alt+m
        test();

    }

    private static void test() {
        System.out.println("input a file name");
        Scanner scanner=new Scanner(System.in);
        String fileName=scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile(fileName,"r");
            //mode后面只能写r  rw rws rwd四个中的一个
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.err.println("file not found!");//快捷键serr
            test();//递归
        }
    }
}
