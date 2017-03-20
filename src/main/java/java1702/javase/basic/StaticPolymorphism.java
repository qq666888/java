package java1702.javase.basic;

/**
 * Created by SONY on 2017/3/17.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        CalculatorTest calculatorTest=new CalculatorTest();
        System.out.println(calculatorTest.add(1,2));

        System.out.println(calculatorTest.add(1,2));
        System.out.println(calculatorTest.add(1d,3));

    }
}

class CalculatorTest {
    public  int add(int x,int y) {//类型不一样
        return x+y;
    }
    public  int add(int f,int g,int k) {//数量不一样
        return f+g+k;
    }
    public double add(double a,double b) {
        return a+b;

    }
    public  double add(float i,double j) {//顺序不一样
        return i+j;
    }
    public  double add(double j,float i) {
        return i+j;
    }
}


