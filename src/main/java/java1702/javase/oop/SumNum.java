package java1702.javase.oop;

import javax.swing.plaf.metal.MetalIconFactory;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 *////求出1-10这10个整数的和
public class SumNum {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7,8,9,10};
        int sum=0;//进行累加求和的变量
        System.out.println("和是");
        for (int i = 0; i <10 ; i++) {
            if(i==9){
                System.out.println("=");
            }
                else{
                    System.out.println("+");
                }
                sum=sum+num[i];
            System.out.println(sum);


        }
    }
}
