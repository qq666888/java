package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/15.
 */
public class Oop1 {
    public  static boolean a(int year){//访问限定修饰符+返回类型+方法名（）{}
        if (year%4==0&&year%100!=0)
            return true;
        return  false;
    }

    public static void main(String[] args) {
        Oop1 oop1=new Oop1();
        System.out.println(oop1.a(2008));
        DefaultClass defaultClass=new DefaultClass();
        System.out.println(defaultClass.toString());//
    }
}
