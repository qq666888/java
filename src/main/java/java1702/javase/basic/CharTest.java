package java1702.javase.basic;

/**
 * Created by SONY on 2017/3/8.
 */
public class CharTest {//
    public static void main(String[] args) {//这是主函数，是程序的入口，它的出现可以保证程序的独立运行
        char c = 65535;
        System.out.println((int)c);//整数，加小括号，强制转换[0,65535]

        char c1 ='a';//单个字符
        System.out.println(c1);//这是输出语句用于将括号内的数据打印到数据台

        char c2 ='\124';//3位八进制字符 \000 ~ \377
        System.out.println(c2);

        char c3 ='\u1234';//4位十六进制字符，unicode 字符
        System.out.println(c3);

        char c4 ='\t';//表示水平制表符 转义字符串
        System.out.println(c4);

        char c5 ='\b';//退格符
        System.out.println(c5);

        char c6 ='\n';//换行
        System.out.println(c6);

        char c7 ='\r';//回车
        System.out.println(c7);

        char c8 ='\f';//换页
        System.out.println(c8);

        char c9 ='\'';//单引号
        System.out.println(c9);


        char c10 ='\"';//双引号
        System.out.println(c10);

        char c11 ='\\';//反斜线
        System.out.println(c11);



    }
}
