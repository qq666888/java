package java1702.javase.exam5;

/**
 * Created by $qiqi
 * on 2017/4/15.
 * java
 */
public class E2 {
    public static void main(String[] args) {
        String s = "abdjkkgnsbhxjdhhdjsjnfbsgabsbdhsn";
        int max = 0;
        int[] cnt = new int[127];
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            max = (++cnt[c] > max) ? cnt[c] : max;
        }
        System.out.println (max);


    }





}


