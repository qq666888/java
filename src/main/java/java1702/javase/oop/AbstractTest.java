package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/21.
 * java
 *///一个抽象方法必须得在一个抽象类里面
public abstract class AbstractTest {//抽象
    private int i;
    public  abstract void method1() ;//abstract修饰method方法，不能加方法体
    public  abstract void method2() ;
    public void method3() {

    }

    public static void main(String[] args) {
    //  AbstractTest abstractTest=new AbstractTest() ;//instantiated实例化
        SubAbstractTest subAbstractTest=new SubAbstractTest();
        System.out.println(subAbstractTest);
        subAbstractTest.method1();
    }
}

class SubAbstractTest extends AbstractTest {


    @Override
    public void method1() {
        System.out.println("in SubAbstractTest...");//实现就是添加方法体的过程
    }



    @Override
    public void method2() {//方法体可以为空

    }

    @Override
    public void method3() {//覆盖
        super.method3();
    }
}