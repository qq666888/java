package java1702.javase.reflect;

import java.io.File;
import java.lang.reflect.Field;

/**
 * Created by $qiqi
 * on 2017/5/3.
 * java
 */
 class Animals {
    public int age;
    private double weight;

    public Animals() {
    }

    public Animals(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    private void killHuman() {
        System.out.println("killed a poor guy...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int sleep(int hours) {
        return hours;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Human extends Animals {
    public String name;
    private boolean married;

    public Human() {
    }

    public Human(int age, double weight, String name, boolean married) {
        super(age, weight);
        this.name = name;
        this.married = married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " is now eating " + food);
    }

    public void study(String course) {
        System.out.println(name + " is now studying " + course);
    }

    private void killAnimals(String animal) {
        System.out.println(name + " is now killing " + animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        Class clazz = human.getClass();
        Field[] fields = clazz.getFields();//获得所有公有域
        System.out.println("--- getFields() ---");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = clazz.getDeclaredFields(); // declared 宣布\ [dɪ'kleəd] 声明
        System.out.println("--- getDeclaredFields() ---");
        for (Field declaredField : declaredFields) {//获得此类所有域
            System.out.println(declaredField.getName());
        }
    }
}