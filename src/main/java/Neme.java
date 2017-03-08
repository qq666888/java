/**
 * Created by SONY on 2017/3/7.
 */
public class Neme {
    public static void main(String[] args) {
       /* char c4 = '\u9fdd';
        System.out.println(c4);
        int m = 10;
        int n = 20;
        System.out.println(m % n);// 求余*/
      /* boolean a = true
        boolean b = false
        System.out.println(a & b);*/
       //&  && ab都为true,结果为ture
        //|  || ab都为false,结果为false
        //^ ab不相同,结果为ture（异）
        //！ 取反,单目运算符
        int x = 2;
        int y = 1;
        System.out.println(x > y && y++ < x);
        System.out.println( x  >y & y < x);
        System.out.println(x>>>y);




    }
}
