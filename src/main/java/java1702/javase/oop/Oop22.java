package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/16.
 */
public class Oop22 {
    int a;
    public int jiecheng(int a) {
        if(a==1){
            return 1;
        }else {
            return a*jiecheng(a-1);
        }


    }

    public static void main(String[] args) {
        Oop22 oop22=new Oop22();
        System.out.println(oop22.jiecheng(5));
    }
}
