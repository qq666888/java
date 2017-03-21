package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/3/20.
 * java
 */
public class Hu extends Oop1 {
    private  int i;
    int j;
    protected int a;
    public int b;
    public int add(){
        i=a;
        return 5;
    }

    public Hu(int i, int j, int a, int b) {
        this.i = i;
        this.j = j;
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        int i=1;

        System.out.println(i);
        Hu hu=new Hu(1,2,3,4);
        System.out.println(hu.r);
    }

}

