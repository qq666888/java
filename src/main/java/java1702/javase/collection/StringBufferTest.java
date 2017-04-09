package java1702.javase.collection;

/**
 * Created by $qiqi
 * on 2017/3/29.
 * java
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // java.lang.StringBuffer
        // buffer 缓冲\ ['bʌfə]

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);

        java.lang.String s = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(s);
        java.lang.String s1 = stringBuffer1.toString();

        // append 附加\ [ə'pend]
        // prepend

        // String 不可变
        java.lang.String s2 = "true"; // string pool : "true"
        s2 += "123"; // string pool : "true" "true123"

        System.out.println(stringBuffer.append(true).append(123));
        System.out.println(stringBuffer.delete(4, 6));//delete删除
        // insert 插入\ [ɪn'sɜːt]
        // offset 偏移,\ 抵消,\ 位移
        System.out.println(stringBuffer.insert(4, false)); //将数据插入到指定位置
        // truefalse3

        // reverse vt.\ 颠倒；倒转
        System.out.println(stringBuffer.reverse());

        stringBuffer.setCharAt(0,'a');//setCharAt修改
        stringBuffer.reverse().setCharAt(0,'a');//setCharAt打印出来是逆向的，所以前面加
       // reverse()翻转过来（上面翻转过一次）

        System.out.println(stringBuffer);
    }

    private static java.lang.String reverse(String origin) {
        StringBuffer stringBuffer = new StringBuffer((CharSequence) origin);
        return stringBuffer.reverse().toString();
    }
}
