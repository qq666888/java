package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/24.
 * java
 */
public class PrimitiveTest {
    public static void method(int x) {//值传递
        System.out.println("b:" +x);//打印结果0
        x++;
        System.out.println("c:"+x);//打印结果1

    }

    public static void main(String[] args) {
        int i=0;//实际参数
        System.out.println("a:"+i);//第一次打印结果0
        method(i);//第二次打印直接调用上面的方法method，i传递参数值给x
        System.out.println("d:"+i);//最后一次打印结果还是实际参数值，不做改变
    }
}
