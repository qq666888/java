package java1702.javase.basic;

/**
 * Created by SONY on 2017/3/16.
 */
public class Father {//super class base class父类 超类 基类
    int money;
    public  String  coding(){
        System.out.println("Father...");
        return "ftkin";

    }
}
class Son extends Father{//sub class  子类
//继承实现了代码的重用，提高软件开发效率
//继承关系是可以传递的
}
class  ExtendsTest {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.money);
        System.out.println(father.coding());
        Son son=new Son();
        System.out.println(son.money);
        son.coding();

    }
}
