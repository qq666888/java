package java1702.javase.exam4;

/**
 * Created by $qiqi
 * on 2017/4/8.
 * java
 */
public class Person {
    private String name;
    private int pay;

    public Person(String name, int pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

}



 class Scientist extends Person {//科学家


    private int endPay;

    public Scientist(String name, int pay ,int endPay) {
        super(name, pay);
        this.endPay = endPay;
    }
    public int getEndPay() {
        return endPay;
    }

    public void setEndPay(int endPay) {
        this.endPay = endPay;
    }
}

 class Teacher extends Person {

    private int oneDayPay;

    public Teacher( String name, int pay, int oneDayPay) {
        super(name, pay);
        this.oneDayPay = oneDayPay;
    }

    public int getOneDayPay() {
        return oneDayPay;
    }

    public void setOneDayPay(int oneDayPay) {
        this.oneDayPay = oneDayPay;
    }

}

 class OtherPerson extends Person {

    private String a;

    public OtherPerson(String name, int pay) {
        super(name, pay);
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

}
 class Text {

    public static void main(String[] args) {
        Scientist s1 = new Scientist("科学家", 5000, 1000);
        Teacher teacher = new Teacher("教师", 2000,50);
        OtherPerson op = new OtherPerson("工人",1000);
        new Text().printScientist(s1);
        new Text().printTeacher(teacher);
        new Text().printOther(op);
    }

    public void printScientist(Scientist scientist){
        System.out.println(scientist.getName() + "一年工资是:" + (scientist.getPay() * 12 + scientist.getEndPay()));
    }

    public void printTeacher(Teacher t){
        System.out.println(t.getName() + "一年工资是：" + (t.getOneDayPay() * 365 + t.getPay() * 12));
    }

    public void printOther(OtherPerson op){
        System.out.println(op.getName() + "一年工资是：" + (op.getPay() * 12));
    }
}
