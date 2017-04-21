package java1702.javase.io;

import java.io.*;

/**
 * Created by $qiqi
 * on 2017/4/20.
 * java
 */
public class ReaderTest {
    public static void main(String[] args) {

//        Reader reader=null;
//        try {
//            reader = new FileReader("test");
//            int i;
//            while ((i = reader.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (java.io.IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        try(Reader reader=new FileReader("test");

        Writer writer=new FileWriter("")){
            int i;
            while ((i=reader.read())!=-1) {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
