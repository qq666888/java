package java1702.javase.basic;

/**
 * Created by SONY on 2017/3/17.
 */
public class DynamicPolymorphism {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.method();
        SubClass subClass = new SubClass();
        subClass.method();
        SubClass2 subClass2=new SubClass2();
        subClass2.method();

    }
}

