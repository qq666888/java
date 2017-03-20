package java1702.javase.exercise;

/**
 * Created by SONY on 2017/3/14.
 */
public class E10 {
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


        }
    }
}
