package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/15.
 */
public class Oop2 {
    private double length;
    private double width;
    private double height;

    public Oop2(double length,double width,double height) {//Volume体积
        this.length=length;
        this.width=width;
        this.height=height;

    }
    public double v(){
        double a;
        return a=length*width*height;

    }

    public static void main(String[] args) {
       Oop2 oop2=new Oop2(2.0,2.0,2.0);

        System.out.println(oop2.v());


    }
}
