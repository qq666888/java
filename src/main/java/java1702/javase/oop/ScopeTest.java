package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/19.
 * java
 */
public class ScopeTest {//范围，类的作用域范围，从类的起始，到类的终止

//    private  int i;//域

//    public void method() {
//        i=0;
//        int j=1;//局部变量
//        System.out.println(j);
//        for (int k = 0; k < 10; k++) {//块作用域范围，从变量声明之处，到当前块结束之处
//
//        }
//        for (int k = 0; k < 10; k++) {//循环变量
//
//        }
//    }
public  void method() {
    int i=0;
    int j=1;

    System.out.println(this.i);

}
private  int i;

    public static void main(String[] args) {
        ScopeTest scopeTest=new ScopeTest();
        scopeTest.method();

    }

    public  void exceptionTest() {//
        String s;
        try {
             s="hello";
        } catch(Exception e){

        }finally {
            s="hi";

        }

    }
}
