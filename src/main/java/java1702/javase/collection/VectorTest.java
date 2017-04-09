package java1702.javase.collection;
        import java.util.HashSet;
        import java.util.Set;
        import java.util.Vector;

/**
 * Created by $qiqi
 * on 2017/3/29.
 * java
 */
public class VectorTest {//Vector向量
    public static void main(String[] args) {

        Vector<java.lang.String> vector = new Vector<>(); // JDK5

        vector.add("hi"); // 元素 组件
        vector.add("hello");
        vector.add("test");
        vector.add("hi");
        System.out.println(vector.remove(99));//remove移除
        vector.set(99,"test");
        System.out.println(vector.get(0));
        vector.clear();
        System.out.println(vector.size());
        System.out.println(vector.size());

        for (java.lang.String s : vector) {
            System.out.println(s);
        }
        System.out.println(vector.get(0));//索引1角标上的元素
        System.out.println(vector.size());//size查看容器有多少元素，大小
        System.out.println(vector.capacity());
        // capacity 容量,\ 能力,\ 容积(默认容量10，大于10-20之间，容量翻倍为20，大于20-3-之间，容量变为40)
        Vector<Integer>integers=new Vector<>();
        integers.add(1);
        System.out.println(integers.size());
        System.out.println(integers.capacity());

        Set<java.lang.String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        System.out.println(strings.size());
    }
}
