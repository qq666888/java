package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/16.
 */
public class Oop21 {

    /*int n;

        public static void main(String[] args) {
            long sum=0;
            for (int i = 1; i < 21; i++) {
                long n=1;
                for (int j = 1; j <i+1; j++) {
                    n*=j;

                }
                sum=sum+n;
            }
            System.out.println(sum);
        }
    }*/
    public static void main(String[] args) {
        long sum = 0;//定义一个变量sum,把和存放在sum里
        long a = 1;//定义一个变量a
        for (int i = 1; i <= 21; i++) {//做1-20循环
            a = 1;//每次a都从1开始
            for (int j = 1; j < i; j++) {//求每个数的阶乘
                a = a * i;//i的阶层
            }

            sum = sum + a;//每个数的阶乘求好后都加入sum

        }
        System.out.println(sum);//输出和sum
    }

}