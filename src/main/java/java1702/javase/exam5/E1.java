package java1702.javase.exam5;

/**
 * Created by $qiqi
 * on 2017/4/15.
 * java
 */
public class E1 {
    public static void main(String[] args) {
        String s1 = "1,3,5";
        String s2 = "2,4,1,7,5";
        int len1 = 3;
        int len2 = 5;
        E1 c = new E1();

        System.out.println(c.getDiffNum(len1,s1,len2,s2));
    }
    public int getDiffNum(int len1, String s1, int len2, String s2)  {
        int a = 0;
        int len = 0;
        String[] arr1 = s1.split(",");
        String[] arr2 = s2.split(",");
        if(len1 > len2) len = len2;
        else len = len1;
        for(int i=0;i<len;i++) {
            if(!arr1[len1-i-1].equals(arr2[len2-i-1])) {
                a ++;
            }
        }
        return a;
    }
}
