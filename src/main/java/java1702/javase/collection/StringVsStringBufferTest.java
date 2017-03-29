package java1702.javase.collection;

/**
 * Created by $qiqi
 * on 2017/3/29.
 * java
 */
public class StringVsStringBufferTest {
    private static final java.lang.String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // alphabet 字母\ ['ælfəbet]

    public static void main(String[] args) {
        java.lang.String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        System.out.println("time: " + (System.currentTimeMillis() - start));
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}
