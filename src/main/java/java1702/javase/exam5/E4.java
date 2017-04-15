package java1702.javase.exam5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by $qiqi
 * on 2017/4/15.
 * java
 */
public class E4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
            System.out.println("输入字符串：");
            String input = sc.nextLine();
        System.out.println(new E4().getMaxCharacters(input));
        }

        public String getMaxCharacters(String input){
            char[] chars = new char[255];
            char[] in = input.toCharArray();

            Set<Character> set=new HashSet<Character>();
            int max = 0;
            for (int i = 0; i < in.length; i++) {
                int a = (int)++chars[in[i]];
                if(a>= max){

                    if(a > max)
                        set.clear();
                    max = a;
                    set.add(in[i]);
                }
            }

            StringBuilder sb = new StringBuilder();
            Object[] array = set.toArray();
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j <= max; j++) {
                    sb.append((array[i]).toString());
                }
            }

            return sb.toString();
        }
    }

