package java1702.javase.Multithreading;

/**
 * Created by $qiqi
 * on 2017/5/10.
 * java
 */
public class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    synchronized void withdraw(int money) {
        System.out.println(Thread.currentThread().getName());
        if(this.money-money<0){
            System.out.println("No enough...");
            return;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.money-=money;
        System.out.println("get the money");

    }

    public int getMoney() {
        return money;
    }
}

class Person implements Runnable {
    private static Account account=new Account(1000);

    @Override
    public void run() {

        account.withdraw(1000);

    }

    public static void main(String[] args) {
        Thread boy=new Thread(new Person(),"boy");
        Thread girl=new Thread(new Person(),"girl");
        boy.start();
        girl.start();
        try {
            boy.join();
            girl.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.getMoney());


    }
}
