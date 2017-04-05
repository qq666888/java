package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//求对角线和
public class Trace {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int he=0;
        System.out.println("打印出数组");
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println(" ");
            
        }
        for (int i = 0; i < arr.length; i++) {
            int[] ints = arr[i];
            he+=arr[i][i];

        }
        System.out.println("对角线和" + he);
    }
}
