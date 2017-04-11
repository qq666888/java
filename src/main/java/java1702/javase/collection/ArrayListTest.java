package java1702.javase.collection;



import java.util.*;
import java.util.ArrayList;

/**
 * Created by $qiqi
 * on 2017/4/10.
 * java
 */
public class ArrayListTest {
    public static void main(String[] args) {
//        List<String>list=new ArrayList<>();
       List<String>list=new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("test1");
        list.add("test2");
        System.out.println(list.addAll(0,list));
        //addAll从指定的位置开始，将指定 collection 中的所有元素插入到此列表中
        System.out.println(list.remove(1));
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.set(1,"Hi"));
        for(String s:list){
            System.out.println(s);
        }
        System.out.println(list.contains("test1"));
        System.out.println(list.containsAll(list));
        System.out.println(list.indexOf("test1"));
        System.out.println(list.isEmpty());
        System.out.println(list.lastIndexOf("test1"));


    }
}
