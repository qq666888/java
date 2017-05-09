package java1702.javase.exam7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.regex.Matcher;

/**
 * Created by $qiqi
 * on 2017/5/6.
 * java
 */
public class E4 {
    public static void main(String[] args) throws Exception {
        Class<?>cl=Class.forName("java.lang.String");
        System.out.println("String 类的所有域");
        Field[]fields=cl.getDeclaredFields();
        for(Field f:fields){
            System.out.println(f);
        }
        System.out.println("String 类的所有构造方法");
        Constructor[]constructors=cl.getConstructors();
        for(Constructor c:constructors){
            System.out.println(c);
        }
        System.out.println("String 类的所有成员方法");
        Method[]methods=cl.getDeclaredMethods();
        for(Method m:methods){
            System.out.println(m);
        }


    }
}
