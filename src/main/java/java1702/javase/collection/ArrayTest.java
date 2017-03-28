package java1702.javase.collection;

/**
 * Created by $qiqi
 * on 2017/3/27.
 * java
 */
public class ArrayTest {//Array数组
    public static void main(String[] args) {
        String[] strings;
        strings=new String[10];
        System.out.println(strings[0]);//下标。索引
        boolean[]booleans=new boolean[100];
        System.out.println(booleans[99]);

        int[] ints=new int[1000];
        System.out.println(ints[1]);

        double[] doubles=new double[10000];
        System.out.println(doubles[999]);
        ArrayTest[] arrayTests=new ArrayTest[3];
        arrayTests[0]=new ArrayTest();
        System.out.println(arrayTests[0]);

        ArrayTest[] arrayTests1 = {new ArrayTest(), new ArrayTest(), new ArrayTest()};
//        arrayTests[0] = new ArrayTest();
        System.out.println(arrayTests[0]); // java1702.javase.collection.ArrayTest@
        System.out.println(arrayTests[1]); // ?
        System.out.println(arrayTests[2]); // ?

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May"};

        // itar + tab快捷键//itar，迭代，循环
        for (int i = 0; i < months.length; i++) {//数组循环时，推荐使用length
            String month = months[i];
            System.out.println(month);
            
        }

        System.out.println("-------------");

        // iter + tab快捷键
        for (String month : months) {
            System.out.println(month);
            
        }
        int[] monthDays = {31, 28};
        Object[] objects=new Object[10];
        objects[1]=1;
        objects[2]=1.2;
        objects[3]="hello";
        objects[4]=new ArrayTest();
        for (int i = 0; i < objects.length; i++) {
            Object object = objects[i];

        }
        for (Object object : objects) {
            System.out.println(object);

        }

    }
}
