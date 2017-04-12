package java1702.javase.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by $qiqi
 * on 2017/4/12.
 * java
 */
public class TreeMapTest
{
    public static void main(String[] args) {
        TreeMap<String,Integer>map=new TreeMap<>();
        map.put("a", 1);
        map.put("bcd", -1);
        map.put("bcde", 100);

        System.out.println(map.size());
        System.out.println(map.get("e"));
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry);

        }
    }
}
