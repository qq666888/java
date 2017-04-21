package java1702.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by $qiqi
 * on 2017/4/20.
 * java
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer=null;
        try {
            writer = new FileWriter("new");
//            writer.write(Integer.parseInt("4e00", 16));
            writer.write(0x4e01);
            // 0b1111_1111_0000 b binary 二进制
            // 0111 八进制
            // 0x11
            System.out.println(011);
            writer.flush();//刷新(关闭之后还可以写）
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();//先调用flush，然后再关闭
                    //关闭之后不可以写
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
