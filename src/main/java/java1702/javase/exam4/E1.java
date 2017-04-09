package java1702.javase.exam4;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/4/8.
 * java
 */
public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String strings=scanner.nextLine();
        byte[] bytes= strings.getBytes();
        int Sum = 0;
        for(int i = 0 ; i < bytes.length ; i++){
            Sum = Sum + bytes[i];
        }
        System.out.print(Sum);
    }

}
