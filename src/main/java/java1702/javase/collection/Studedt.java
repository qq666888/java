package java1702.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by $qiqi
 * on 2017/4/10.
 * java
 */
public class Studedt {

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("nanme");//添加元素
        list.add("sex");
        list.add("age");
//        Iterator iterators=list.iterator();//获取迭代器，用于去除集合中的元素
//        while (iterators.hasNext()){//如果仍有元素可以迭代，则返回 true。
//            System.out.println(iterators.next());//返回迭代的下一个元素
//        }快捷键itit+tap

        for(Iterator iterators=list.iterator();iterators.hasNext();){
            System.out.println(iterators.next());
        }

    }

}
