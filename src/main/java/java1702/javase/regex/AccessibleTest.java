package java1702.javase.regex;

import java.lang.reflect.Field;

/**
 * Created by $qiqi
 * on 2017/5/4.
 * java
 */
public class AccessibleTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person person=new Person(29);
        Field age=Class.forName("java1702.javase.regex.Person").getDeclaredField("age");
//        Field age=person.getClass().getDeclaredField("age");
        age.setAccessible(true);
        age.setInt(person,age.getInt(person)+1);
        System.out.println(age.getInt(person));
    }

}

class Person{
    private int age;
    public Person(int age){
        this.age=age;
    }
}
