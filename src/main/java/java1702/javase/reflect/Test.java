package java1702.javase.reflect;

/**
 * Created by $qiqi
 * on 2017/5/5.
 * java
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new FloppyWriter());
        service.write();
    }
}
