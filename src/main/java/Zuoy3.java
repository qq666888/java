/**
 * Created by SONY on 2017/3/8.
 */
public class Zuoy3 {
    public static void main(String[] args) {
        int i = 90;
        int k = 2;
        System.out.print(i + "=");
        while (i > k) {
            if (i % k == 0) {
                System.out.print(k + "×");
                i = i / k;
            }
            if (i % k != 0) {
                k++;
            }
        }
        System.out.println(k);
    }
}
