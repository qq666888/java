package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/15.
 */
public class Oop3 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.setName("Tom");
        System.out.println(person.getName());
        System.out.println(person.getAge());
       // person.setSex('f');
        System.out.println(person.getSex());
    }


}
class Person {
       private String name;
       private char sex;
       private int age;

  /*  public String getName() {//获取名字
        return name;
    }

    public void setName(String name) {//修改名字
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

