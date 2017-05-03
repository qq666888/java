package java1702.javase.exam6;

import java.io.*;
import java.util.Random;

/**
 * Created by $qiqi
 * on 2017/4/22.
 * java
 */
public class E4 {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("c:/a.text");
            Random rd = new Random();
            for(int i=0;i<5000;i++){
                int j = rd.nextInt(9999) + 1;
                fw.write("\t"+j+"\r\n");
            }

            fw.close();
            BufferedReader bReader = new BufferedReader(new FileReader("C:/a.txt"));
            int sum = 0;
            int count = 0;
            float avg = 0.0f;
            int max = 0;
            int min = 10000;
            String reg = "\\d+";
            while (bReader.read()!=-1) {
                String strValueString = bReader.readLine();
                if(!strValueString.matches(reg)){
                    continue;
                }
                count++;
                int i = Integer.valueOf(strValueString.trim()).intValue();
                sum += i;
                max = i > max ? i : max;
                min = i < min ? i : min;
            }
            bReader.close();
            avg = (float)sum/count;
            System.out.println("最大数:" + max + "，最小数:" + min + "，平均数:" + avg + "，总个数:" + count + "，总数" + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
