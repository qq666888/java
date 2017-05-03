package java1702.javase.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by $qiqi
 * on 2017/4/21.
 * java
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile("raf","rw");
            for(int i=0;i<10;i++) {
                randomAccessFile.writeDouble(i*0.5);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

