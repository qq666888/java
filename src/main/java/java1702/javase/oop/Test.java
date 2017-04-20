package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/4/17.
 * java
 */
public class Test {//Exception异常，例外
    public static void main(String[] args) {
        try {
            System.out.println("hello".charAt(5));
        }catch (IndexOutOfBoundsException e){//catch捕获
            e.printStackTrace();
        }


//        try {//Ctrl+Alt+T
//            System.out.println("test...");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("test");
//
//
//        try {
//            System.out.println("hello".charAt(5));// java.lang.StringIndexOutOfBoundsException
//        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
        //(此异常由 String 方法抛出，指示索引或者为负，或者超出字符串的大小。对诸如 charAt 的一些方法
        // ，当索引等于字符串的大小时，也会抛出该异常。 )
        System.out.println((new int[]{1,2,3})[-1]);//java.lang.ArrayIndexOutOfBoundsException: -1(
      //  用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。)
        System.out.println(1/0);// java.lang.ArithmeticException
        //(当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。)
        System.out.println(Integer.valueOf("l23"));//java.lang.NumberFormatException
       // (当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。)
        String s ="hi";
        s=null;
        System.out.println(s.toUpperCase());//NPE空指针异常NullPointerException
//        (当应用程序试图在需要对象的地方使用 null 时，抛出该异常。这种情况包括：
//
//        调用 null 对象的实例方法。
//        访问或修改 null 对象的字段。
//        将 null 作为一个数组，获得其长度。
//        将 null 作为一个数组，访问或修改其时间片。
//        将 null 作为 Throwable 值抛出。
//        应用程序应该抛出该类的实例，指示其他对 null 对象的非法使用。)


        System.out.println("test");
    }
}
