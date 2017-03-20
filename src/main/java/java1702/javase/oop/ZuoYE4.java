package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/8.
 */
public class ZuoYE4 {
    public static void main(String[] args) {
        int grade =50;
        if( grade>=90 && grade<=100) {
            System.out.println("A");
        }
        else if (grade>=60 && grade<90){
            System.out.println("B");
        }
        else if ( grade<60 && grade >=0){
            System.out.println("C");
        }
    }
}
