package java1702.javase.exam4;

/**
 * Created by $qiqi
 * on 2017/4/8.
 * java
 */
public interface Animal {
    void eat();
}


 class Bird implements Animal{

    @Override
    public void eat() {

    }
     public void flying() {
         System.out.println("fiying");

     }
}



class Fish implements Animal{

    @Override
    public void eat() {

    }
    public void swimming() {
        System.out.println("swimming");

    }
}

class Testex{
    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.eat();
        bird.flying();

        Fish fish=new Fish();
        fish.eat();
        fish.swimming();


    }
}
