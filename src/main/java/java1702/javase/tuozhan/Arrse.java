package java1702.javase.tuozhan;

/**
 * Created by $qiqi
 * on 2017/4/7.
 * java
 */
public class Arrse {

    public static void main(String[] args) {
        int[][]arr=new int[3][3];


//        int[][] arr = {{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                System.out.print(arr[i][j] + " ");

            }

            System.out.println(" ");
        }

    }

}
