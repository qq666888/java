package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/24.
 * java
 */
//public class PrimitiveTest {
//    public static void method(int x) {//值传递
//        System.out.println("b:" +x);//打印结果0
//        x++;
//        System.out.println("c:"+x);//打印结果1
//
//    }
//
//    public static void main(String[] args) {
//        int i=0;//实际参数
//        System.out.println("a:"+i);//第一次打印结果0
//        method(i);//第二次打印直接调用上面的方法method，i传递参数值给x
//        System.out.println("d:"+i);//最后一次打印结果还是实际参数值，不做改变
//    }
//public static void method(boolean b) {
//    System.out.println("b "+b);
//    b=false;
//    System.out.println("c "+b);
//
//}
//
//    public static void main(String[] args) {
//        boolean b=true;
//        System.out.println("a "+b);
//        method(b);
//        System.out.println("d "+b);
//    }

//    private String s;
//
//    // java.lang.String FQN
//    private static void method(PrimitiveTest p) { // 值传递
//        System.out.println("b: " + p.s); // hello
//        p.s = "hi";
//        System.out.println("c: " + p.s); // hi
//    }

//    public static void main(String[] args) {//引用传递
//        PrimitiveTest primitiveTest = new PrimitiveTest();
//        primitiveTest.s = "hello"; // 0
//        System.out.println("a: " + primitiveTest.s); // hello
//        method(primitiveTest);
//        System.out.println("d: " + primitiveTest.s); // hello
//    }

 class Boxed { // 封装类 装箱类
        public static void main(String[] args) {
//        int i = 0;
//        double d = 1.2d;

            Integer i = new Integer(0);
            Double d = new Double(1.2d);

        /*
        java.lang//基本数据类型的封装类
            boolean - Boolean
            byte - Byte
            char - Character*
            short - Short
            int - Integer*
            long - Long
            float - Float
            double - Double
         */

            System.out.println(i);
            System.out.println(d);
        }
    }

