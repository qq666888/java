package java1702.javase.exam4;

/**
 * Created by $qiqi
 * on 2017/4/8.
 * java
 */
public class E2 {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j++;
            }
        }

        int[] b = new int[a.length - j];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[k++] = a[i];


            }
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
