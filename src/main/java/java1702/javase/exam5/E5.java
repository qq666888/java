package java1702.javase.exam5;

import java1702.javase.collection.Test;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/4/15.
 * java
 */
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个浮点数");
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (!input.contains("."))
                System.out.println(Integer.parseInt(input));
            else {
                int index = input.indexOf(".");
                if (input.charAt(index + 1) >= '5')
                    System.out.println(Integer.parseInt(input.substring(0, index)) + 1);
                else
                    System.out.println(Integer.parseInt(input.substring(0, index)));
            }

        }
        scanner.close();
    }
    }


