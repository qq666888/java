package java1702.javase.collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by $qiqi
 * on 2017/3/29.
 * java
 */
public class HashtableTest {//哈希表是无序的，键和值不能为空，哈希表不存在相同的键，
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int c=a!=b? b:a;
        System.out.println(c);
        // K - key 键  V - value 值
        Hashtable<Integer, java.lang.String> hashtable = new Hashtable<>();
        hashtable.put(1, "hi");//放入元素（键，值）
        hashtable.put(2, "hello");
        hashtable.put(3, "hello");
        hashtable.put(3, "test");//把3键的值更改为"test"
        hashtable.remove(2);//移除

        System.out.println("size: " + hashtable.size());//大小（求放入容器里面键的总个数）
        System.out.println(hashtable.get(2));//获取第（）键对应的值
        System.out.println(hashtable.contains("hi"));
//        hashtable.remove(1);
        System.out.println(hashtable.size());

        for (Integer integer : hashtable.keySet()) { // set 设置 集合
          //  keySet键对应的集合（获取键的集合）
            System.out.println(integer + "->" + hashtable.get(integer));
        }

        for (java.lang.String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, java.lang.String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        }
        System.out.println(hashtable.toString());
        System.out.println(hashtable.containsKey(2));//是否包含（）键？
        System.out.println(hashtable.containsValue("hi"));//是否包含（）值？
        System.out.println(hashtable.contains(2));//映射键对应的值
//通过Map.Entry方法可以获取键的集合，也可以获取值的集合
    }
}
