package java1702.javase.exam;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by SONY on 2017/3/18.
 */
public class E4 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("输入摄氏温度 C:");
        int C= scanner.nextInt();
        int F=((9 / 5) *C + 32);
        System.out.println("华氏温度"+F);
    }
}
