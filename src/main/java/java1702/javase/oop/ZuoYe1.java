package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/8.
 */
public class ZuoYe1 {
    public static void main(String[] args) {
        int i,j;
        for(i=101;i<=200;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)//TODO: 2017/3/14  (todo+tab快捷键）如果(i%j==0)j=2;j<i;i不是素数
                {
                   break;//跳出当前这一个循环
                }
            }
            if(i==j)//进入j++,若i==j，打印出来
            {
                System.out.println(i);
            }

        }


    }
}
