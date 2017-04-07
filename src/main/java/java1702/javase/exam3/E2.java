package java1702.javase.exam3;

import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/4/1.
 * java
 */
public class E2 {
    public static void main(String[] args){
//       StringBuffer s1 = new StringBuffer();
//
//        String s2 = "abcDEF";
//
//
//        char c[] = s2.toCharArray();
//
//
//        for(int i = 0; i<s2.length(); i++){if(c[i]>=97){
//            s1.append((c[i]+"").toUpperCase());
//        }
//
//        else{
//            s1.append((c[i]+"").toLowerCase());
//        }
//
//        }
//        System.out.println(s2);
//        System.out.println(s1);
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(s);
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(aChar>='A'&& aChar<='Z'){
                chars[i]=(char)(aChar+32);
            }
            if(aChar>='A'&& aChar<='Z'){
                chars[i]=(char)(aChar-32);
            }

        }
        char temp=chars[0];
        chars[0]=chars[chars.length-1];
        chars[chars.length-1]=temp;
        System.out.println(String.valueOf(chars));
        System.out.println(new String(chars));
    }
}
