package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/21.
 * java
 */
public final class FinalTest {//Final终态
    //private final int i=0;
    private  final int i;

    public FinalTest(int i) {
        this.i=i;

    }
    public FinalTest() {
        i=0;
    }


    public  final void method() {


    }

    public static void main(String[] args) {
        FinalTest finalTest=new FinalTest(1);
        System.out.println(finalTest.i);

    }


}

