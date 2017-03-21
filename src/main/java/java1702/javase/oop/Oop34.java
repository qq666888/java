package java1702.javase.oop;

import java.util.Random;
//随机生成【1，20】数10000次，使用两种方法实现，（java.lang.math,java.util.random），并判断两种方法的效率和分布

/**
 * Created by $qiqi
 * on 2017/3/20.
 * java
 */
public class Oop34 {
   /* public static void main(String []args)
    {
        for(int i=0;i<=1000;i++)
        {
            double rd = (int)(Math.random()*20)+1;//random随机的，Math数学
            System.out.println(rd);
        }
    }
*/

    public static void main(String[] args) {
        Random random=new Random();
        long start=System.currentTimeMillis();
        System.out.println(start);
        for(int i=0 ;i<1000;i++) {
            int r=random.nextInt(20)+1;
        }
        long end=System.nanoTime();
        System.out.println(end-start);


    }
}
