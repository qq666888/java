package java1702.javase.exam;

/**
 * Created by SONY on 2017/3/18.
 */
public class E3 {
    private double a;
    private double b;
    private double c;

    public E3(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public double zhouchang(){
        double l;
        return l=a+b+c;

    }
    public double mianji() {
        double s;
        return s=(a+b+c)/2;
    }

    public static void main(String[] args) {
        E3 e3=new E3(2.0,2.0,2.0);

        System.out.println(e3.zhouchang());
        System.out.println(e3.mianji());


    }
}
