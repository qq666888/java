package java1702.javase.Multithreading;

/**
 * Created by $qiqi
 * on 2017/5/12.
 * java
 */
public class Sync {
    public synchronized void test() {
//        synchronized (Sync.class) {
        System.out.println(Thread.currentThread().getName() + " start...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end...");
//        }
    }
}

class SyncTest implements Runnable {
    private static Sync sync = new Sync();

    public void run() {
//        sync = new Sync();
        sync.test();
    }

    public static void main(String[] args) {
//        SyncTest syncTest = new SyncTest();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SyncTest(), "thread " + i);
            thread.start();
        }
    }
}
