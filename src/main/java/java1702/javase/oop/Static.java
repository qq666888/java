package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/22.
 * java
 */
public class Static {
    public static void main(String[] args) {//static被所有方法和域共享
        ManKinds tom=new ManKinds();
        tom.name = "Tom";
        tom.age = 18;
//        tom.married = true;
        System.out.println(tom.age);
        System.out.println(tom.name);
        System.out.println(tom.married);
        System.out.println("--------------");

        ManKinds jerry = new ManKinds();
        jerry.name = "Jerry";
        jerry.age = 16;
        ManKinds.married = true;
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(ManKinds.married);
    }
}

class ManKinds {
    public String name;
    public int age;
    public static boolean married;
    static {//静态块，初始化作用
    }
}

