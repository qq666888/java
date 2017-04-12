package java1702.javase.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by $qiqi
 * on 2017/4/12.
 * java
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");
        System.out.println(map.size());
        System.out.println(map.get(1));
        for (Integer integer : map.keySet()) {
            System.out.println(integer);

        }
    }
}
