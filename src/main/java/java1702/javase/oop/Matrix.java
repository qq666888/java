package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//在方法中编写代码，实现3行4列且所有元素都是0的矩阵。
public class Matrix {
    public static void main(String[] args) {
        int [][] a=new int[3][4];
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                System.out.print(a[i][j]);

            }
            System.out.println(" ");

        }
    }

}
