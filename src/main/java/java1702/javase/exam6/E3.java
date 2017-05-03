package java1702.javase.exam6;

import java.io.*;

/**
 * Created by $qiqi
 * on 2017/4/22.
 * java
 */
public class E3 {
    public static void main(String[] args) throws IOException
   {
try {
    Writer writer1 = new FileWriter("1.txt");
    writer1.write("abc");
    writer1.flush();
    Writer writer2 = new FileWriter("2.txt");
    writer2.write("def");
    writer2.flush();
    Writer writer3 = new FileWriter("3.txt");
    Reader reader1 = new FileReader("1.txt");
    Reader reader2 = new FileReader("2.txt");
    for (int i = 0; i < 3; i++) {
        writer3.write(reader1.read());
        writer3.write(reader2.read());
    }
    writer3.flush();
    System.out.println(writer1.toString());
    System.out.println(writer2.toString());
}catch (IOException e){
    e.printStackTrace();

}

    }

}
