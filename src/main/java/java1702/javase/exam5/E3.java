package java1702.javase.exam5;

import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/4/15.
 * java
 */
public class E3 {

    public static void main(String[] args){
        String s0 = "123,45,25,85";

        S1.S2(s0);

    }
}


class S1{
    public static String s11(String s0){
        String[] arr = s0.split(",");
        for(int i =0; i<arr.length-1;i++){
            int a = Integer.parseInt(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                int b = Integer.parseInt(arr[j]);
                String aa;
                if(a>b){
                    aa = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aa;
                    a = Integer.parseInt(arr[i]);
                }
            }
        }
        String c ="";
        for(String i: arr){
            c +=i +" ";
        }

        return c;
    }

    public static void S2(String str) {
        String[] arr = str.split(",");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}



