package java1702.javase.collection;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by $qiqi
 * on 2017/4/12.
 * java
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        ListIterator<String>listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex());

        }
        System.out.println(listIterator.next());
        
//        System.out.println(listIterator.previous());

        listIterator.add("f");
        listIterator.set("h");
        listIterator.remove();
    }
}
