package java1702.javase.exercise;



import java.util.ArrayList;


/**
 * Created by $qiqi
 * on 2017/3/31.
 * java
 */
public class ListTest extends ArrayList{//arrayList数组列表，可重复
    public static void main(String[] args) {


   // Identity 可迭代的
    //collection 集合
    //list 列表
    //Set 集合
    //map 映射（一个独立的借口）
        ArrayList<String> arrayList=new ArrayList<>();
//        System.out.println(arrayList.add(1));//添加的一条数据1
//        System.out.println(arrayList.size());//列表元素个数
//        System.out.println(arrayList.get(0));//获取
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hello");

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains("hello"));
        System.out.println(arrayList.indexOf("hello"));
        System.out.println(arrayList.lastIndexOf("hello"));
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.set(1, "test"));
        System.out.println(arrayList.isEmpty());
//        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println("--->" + arrayList);
        Object[] objects = arrayList.toArray();

        ListTest listTest=new ListTest();
        for (int i = 0; i < 10; i++) {
            listTest.add(""+i);
        }
        listTest.removeRange(3, 5);
        for (Object o : listTest) {
//            System.out.println(o);
        }




        }
    }

