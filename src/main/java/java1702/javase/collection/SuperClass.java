package java1702.javase.collection;

/**
 * Created by $qiqi
 * on 2017/4/13.
 * java
 */
//
public class SuperClass <T> {
    public void method(T t){
        System.out.println("method...");
    }
}
class SubClass<T> extends SuperClass<T>{//子类继承父类，子类要想添加范类，必须要给父类也添加范类
    public static void main(String[] args) {
        SuperClass<String>stringSuperClass=new SuperClass<>();
        stringSuperClass.method("test");
        SubClass<String>subClass=new SubClass<>();
        subClass.method("");
    }
}
