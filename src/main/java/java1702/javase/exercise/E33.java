package java1702.javase.exercise;

/**
 * Created by $qiqi
 * on 2017/3/29.
 * java
 */
//题目：打印出杨辉三角形（要求打印出10行如下图）
public class E33 {
//    public static void main(String args[])
//    {
//        int x=10   ;//输入几层是几层
//        int num[][] = new int[x][x];//这个数组有几层
//        for(int m=0;m<x;m++)//主要是对数组进行赋值
//        {
//            for(int n=0;n<=m;n++)//每一层的个数都是小于等于层数的，m代表层数，n代表着第几个数
//            {
//                if(n==0||m==n)//每一层的开头都是1，m==n的时候也是1,必须要这个，凡事都得有个开头
//                {
//                    num[m][n]=1;
//                }
//                else
//                    num[m][n]=num[m-1][n-1]+num[m-1][n];//这个就是递推的方法了，例如3=1+2，3的坐标就是3[3,1]=1[2,0]+2[2,1];
//            }
//        }
//        for(int i=0;i<x;i++)//主要是输出数组
//        {
//            for(int l=i;l<x;l++)//这个主要是打空格，好看一点，去掉就是直角三角形了
//            {
//                System.out.print(" ");
//            }
//            for(int j=x-i;j<=x;j++)//这个就是打印数组了，每层循环几次就几个
//            {
//                System.out.print(num[i][x-j]+" ");//不懂的可以把x替换成10，更加清楚点
//            }
//            System.out.println();//每层换行
//        }
//    }

//    public static void main(String[] args) {
//        int[] array1 = {1};
//        int[] array2 = {1, 1};
//        int[] array3 = {1, 2, 1};
//        int[] array4 = {1, 3, 3, 1};
////        int[] array5 = {1, 4, 6, 4, 1};
//
//        int[] array5 = new int[5];
//        for (int i = 0; i < array5.length; i++) {
//            if (i == 0 || i == array5.length - 1) {
//                array5[i] = 1;
//            } else {
//                array5[i] = array4[i - 1] + array4[i];//假如i=2，
//               // 第5行的第2列=第四行第2列的前一列数字+第四行的第2列的数字
//                //i代表列数
//                //i-1代表第几列的前一列的数字
//            }
//        }
        private static int[] getArray(int n) {
            if (n == 1) {
                return new int[]{1}; //  {1, 2, 3} [1, 2, 3] Arrays.toString(ints);
            } else {
                int[] array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    if (i == 0 || i == array.length - 1) {
                        array[i] = 1;
                    } else {
                        array[i] = getArray(n - 1)[i - 1] + getArray(n - 1)[i];
                    }
                }
                return array;
            }
        }

    }


