package java1702.javase.exam2;

/**
 * Created by $qiqi
 * on 2017/3/25.
 * java
 */
public class Animal implements Flying,Swiming {
    String name;
    String sex;
    int age;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }


    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

class Cat  extends Animal{
    String eye;
    String ear;//耳朵
    public void sleep() {
        System.out.println("sleep");
    }
    public void play() {
        System.out.println("喵喵");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSex() {
        return super.getSex();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}

 interface  Flying  {
     public  abstract void fly() ;

}
 interface  Swiming  {
    public abstract void swim() ;
}

 class E5 {
    public static void method(int x) {
        System.out.println("b:" +x);
        x++;
        System.out.println("c:"+x);

    }

    public static void main(String[] args) {
        int i=0;
        System.out.println("a:"+i);
        method(i);
        System.out.println("d:"+i);
    }
}
