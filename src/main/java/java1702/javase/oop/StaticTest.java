package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/22.
 * java
 */
public class StaticTest {//静态
    private static int i;
    public static void  m() {
        i=1;

    }

    public static void main(String[] args) {
        ManKind tom=new ManKind();
        tom.setName("Tom");
        tom.setAge(18);
        tom.married=false;
        System.out.println(tom.getAge());
        System.out.println(tom.getName());
        System.out.println(tom.married);
    }
}

class ManKind {
    public String name;
    public   int age;
    public  boolean married;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
