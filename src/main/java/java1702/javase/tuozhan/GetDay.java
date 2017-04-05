package java1702.javase.tuozhan;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//创建数组，实现将各月的天数输出
public class GetDay {
    public static void main(String[] args) {
        int[]day={31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < 12; i++) {
            int i1 = day[i];
            System.out.println((i+1)+"月有"+day[i]+"天"+"\t");
            if((i+1)%3==0){
                System.out.println("\n");
            }
            
        }
    }
   
    
}
