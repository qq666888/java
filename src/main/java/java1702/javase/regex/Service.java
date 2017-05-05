package java1702.javase.regex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by $qiqi
 * on 2017/5/5.
 * java
 */
public class Service {
    public void write() {
       Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance());
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
        }
    }

