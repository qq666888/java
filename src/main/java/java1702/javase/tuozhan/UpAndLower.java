package java1702.javase.tuozhan;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//实现字符串的大小写转换
public class UpAndLower {
    public static void main(String[] args) {
        String s=new String("abc EFG");
        String mew1=s.toLowerCase();//小写转换
        String new2=s.toUpperCase();//大写转换
        System.out.println(mew1);
        System.out.println(new2);

    }
}
