package java1702.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by $qiqi
 * on 2017/4/18.
 * java
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream=null;
        try {
//            InputStream inputStream=new FileInputStream("c:/test.txt");
             inputStream=new FileInputStream("test");
           int i;
           while ((i=inputStream.read())!=-1){
               System.out.print((char)i);
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(inputStream!=null){
                try{
                    inputStream.close();//关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
