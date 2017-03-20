package java1702.javase.exam;

/**
 * Created by SONY on 2017/3/18.
 */
public class Person {
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

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;


    }

    public static void main(String[] args) {
        Person person = new Person("Tom", "F", 1);
        System.out.println(person.name);

    }
}

class Student extends Person {

String number;
    public Student(String name, String sex, int age) {
        super(name, sex, age);

    }
}

class Test extends Person {


    public Test(String name, String sex, int age) {
        super(name, sex, age);
    }


    public static void main(String[] args) {
        String s1;
        String s2;
        Student student=new Student("Toy","F",20);
        s1=student.getName()+student.getSex()+student.getAge();
        System.out.println(s1);
        Student student1=new Student("Son","M",21);
        s2=student1.getName()+student1.getSex()+student1.getAge();
        System.out.println(s2);


    }
}
