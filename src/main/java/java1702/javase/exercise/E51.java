package java1702.javase.exercise;

/**
 * Created by SONY on 2017/3/14.
 *///f(n)=1(n=1,n=2)
    //f(n)=f(n-2)+f(n-1)(n>2)
public class E51 {
    //求fibonacci数列的第n项
    public  int fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }else {
        return fibonacci(n-2)+fibonacci(n-1);}
    }
    public static void main(String[] args) {
       E51 e51 = new E51();


        {
            System.out.println(e51.fibonacci(9));
        }

    }
}
