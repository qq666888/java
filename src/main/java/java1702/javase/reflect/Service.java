package java1702.javase.reflect;

/**
 * Created by $qiqi
 * on 2017/5/5.
 * java
 */
public class Service {
    private FloppyWriter floppyWriter;

    public Service(FloppyWriter floppyWriter) {
        this.floppyWriter=floppyWriter;
    }
    //ali+insert


    public void write() {
        floppyWriter.writeToFloppy();
    }
}
