package java1702.javase.collection;
        import java.util.HashSet;
        import java.util.Set;
        import java.util.Vector;

/**
 * Created by $qiqi
 * on 2017/3/29.
 * java
 */
public class VectorTest {
    public static void main(String[] args) {

        Vector<java.lang.String> vector = new Vector<>(); // JDK5

        vector.add("hi"); // 元素 组件
        vector.add("hello");
        vector.add("test");
        vector.add("hi");

//        System.out.println(vector.get(0));
        System.out.println(vector.size());

        for (java.lang.String s : vector) {
            System.out.println(s);
        }

        System.out.println(vector.size());
        System.out.println(vector.capacity());
        // capacity 容量,\ 能力,\ 容积

        Set<java.lang.String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        System.out.println(strings.size());
    }
}
