package java1702.javase.tuozhan;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//在方法中创建String对象，使用indexof()方法查找字符S在字符串S中的索引位置，并输出结果
public class Select extends UpAndLower{
    public static void main(String[] args) {
        Select select = new Select();
        System.out.println(select.a);

        String s="we are students";
        System.out.println(s.indexOf("s"));//indexOf("s")从字符串的起始位置开始搜索，
        // 返回S首次出现位置索引，如果没有搜索到S，返回-1

    }
}
