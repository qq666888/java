package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/23.
 * java
 */
public interface InterfaceTest extends A,B,C,D  {
    int I=1;
    void m();
}

    interface A {
    void a();

    }

    interface B {
    void b();

    }

    interface C {
    void c();

    }

    interface D {
    void d();

    }


class IInterface implements InterfaceTest {


    @Override
    public void m() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    public static void main(String[] args) {
        System.out.println(I);
    }
}