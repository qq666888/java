package java1702.javase.exam3;
import java.util.Arrays;

/**
 * Created by $qiqi
 * on 2017/4/1.
 * java
 */
public class E4 {
    public static void main(String[] args) {
        int[] a = {89,90,77,87,66,54,328,890,99};
        int[] b = {65,72,12,77,2,96,54,27,89};
        int[] c = new int[3 ];
        int cc = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[cc]=a[i];
                    cc++;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }

}
