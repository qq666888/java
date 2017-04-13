package java1702.javase.collection;

/**
 * Created by $qiqi
 * on 2017/4/13.
 * java
 */
public class Test<T> {//T相当于Tapy类型
    //generic,通用的泛型，泛化的类型
    //general一般
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.concat(1,3));
        System.out.println(test.concat(1.0,2.0));
    }
    private String concat(T x,T y){
        return  String.valueOf(x).concat(String.valueOf(y));
    }
//    private  static  String concatt(int x,int y){
//        return  String.valueOf(x).concat(String.valueOf(y));
//        //valueOf,（JAVA中）把基本类型转化为对象类型
//        //concat 合并多个数组,联结合并多个字符串,连接两个字符串
//    }
}
