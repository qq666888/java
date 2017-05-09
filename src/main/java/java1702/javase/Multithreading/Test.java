package java1702.javase.Multithreading;

import sun.text.resources.cldr.en.FormatData_en_IE;

/**
 * Created by $qiqi
 * on 2017/5/8.
 * java
 */
public class Test implements Runnable {
    //implements Runnable 多线程,线程可运行状态
    public static void main(String[] args) {
        //进程process
        //线程thread(一个进程里面可以包含多个线程)
//        run();
//        Test test=new Test();
        Thread thread=new Thread(new Test());
        thread.start();//Runnable就绪
        // start();使该线程开始执行；Java 虚拟机调用该线程的 run 方法
//        test.run();
        System.out.println("test.....");
    }

    @Override
    public void run() {//Running运行
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);

        }

    }

//    private static void run(){
//        for (int i = 0; i <10 ; i++) {
//            System.out.println(i);
//
//        }
//    }
}
