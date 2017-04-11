package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by $qiqi
 * on 2017/4/11.
 * java
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String>strings=new LinkedList<>();
        strings.add("a");
        strings.add("b");
        System.out.println(strings.size());
        System.out.println(strings.get(0));//返回此列表中指定位置处的元素
        for(String string:strings){
            System.out.println(string);
        }
        System.out.println(strings.getFirst());//返回此列表的第一个元素
        System.out.println(strings.getLast());//返回此列表的最后一个元素
    }
}
