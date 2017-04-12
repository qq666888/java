package java1702.javase.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by $qiqi
 * on 2017/4/12.
 * java
 */
public class HashMapTest {//可以使用null键，null值
    public static void main(String[] args) {



        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"b");
        System.out.println(map.size());
        System.out.println(map.get(2));

        for (Integer integer : map.keySet()) {//获取键
            System.out.println(integer);
        }

        for (String s : map.values()) {//获取值
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {//获取键对应值
            System.out.println(entry);
        }
    }
}
