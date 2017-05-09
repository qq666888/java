package java1702.javase.Multithreading;

/**
 * Created by $qiqi
 * on 2017/5/9.
 * java
 */
public class YieldTest implements Runnable {//Yield屈服，让步
    public static void main(String[] args) {
        Thread thread1=new Thread(new YieldTest(),"thread 1");
        Thread thread2=new Thread(new YieldTest(),"thread 2");
        thread1.start();
        thread2.start();
        System.out.println("test...");


    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i+":"+Thread.currentThread().getName()+"is running...");
            if(i%10==0){
                Thread.yield();
            }

        }

    }
}
