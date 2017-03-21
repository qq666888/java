package java1702.javase.exercise;
import java1702.javase.oop.Hu;
//import java1702.javase.oop.Oop1;

/**
 * Created by SONY on 2017/3/14.
 */
public class E10 extends Hu {
    public E10(int i, int j, int a, int b) {
        super(i, j, a, b);
    }

    public static void main(String[] args) {
        float l =100f;
        float s =l;//第一次落地
        for (int i = 0; i <= 9; i++) {
            l /= 2;
            if(i==10){//最后一次只弹起不落地
                s+=l;}
                else {
                s+=2*l;}
                    System.out.println("经过"+s+"米"+","+"最后一次高"+l+"米");
            E10 e10=new E10(1,2,3,4);
            System.out.println(e10.r);


        }
    }
}
