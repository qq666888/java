package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/15.
 */
public class Oop4 {
    double t;//圆周率
    double r;//半径
    public  Oop4(double t, double r){//面积
        this.t=t;
        this.r=r;

    }
    public double acreag(){
        double s;
        return s=2*t*r;
    }

    public static void main(String[] args) {
        Oop4 oop4=new Oop4(2,3);
        System.out.println(oop4.acreag());
    }
}
