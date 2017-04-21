package java1702.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by $qiqi
 * on 2017/4/20.
 * java
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        OutputStream outputStream=null;
        try { // Shift + Ctrl + arrow | Shift + Option + arrow
            outputStream = new FileOutputStream("new");
            outputStream.write(97);
            outputStream.flush(); //
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
