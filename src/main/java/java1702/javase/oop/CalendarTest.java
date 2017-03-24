package java1702.javase.oop;

import java.util.Calendar;
import java.util.concurrent.Callable;

/**
 * Created by $qiqi
 * on 2017/3/23.
 * java
 */
public class CalendarTest {//日历
    //输出某年某月的日历
    public CalendarTest(int year,int month) {
        int cols = 1;
        int days = 1;
        for (int i = 1; i < year; i++) {
            if (((i % 100 != 0) && (i % 4 == 0)) || (i % 400 == 0))//判断是平年还是润年
                days += 366;
            else
                days += 365;

        }
        for (int j = 1; j < month; j++) {//搜索月份，1,3,5,7,8,10,12月是大月31天
            switch (j) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days += 31;
                    break;
                case 2://如果润年2月29天，否则2月28天
                    if (((year % 100 != 0) && (year % 4 == 0)) || (year % 400 == 0))
                        days += 29;
                    else
                        days += 28;
                    break;
                default://其他月份都是三十天
                    days = 30;
                    break;
            }
        }
            System.out.println("\t日" + "\t一" + "\t二" + "\t三" + "\t四" + "\t五" + "\t六");
            for (int m = 1; m <= cols; m++)//cols报表列数
                System.out.print("\t");
            for (int k = 1; k <= days; k++) {
                System.out.print("\t" + k);
                cols++;
                if (cols >= 7) {
                    System.out.println("");
                    cols = 0;
                }
            }
            System.out.println("");

    }
        public static void main(String [] args){
        CalendarTest d1 = new CalendarTest(2012, 5);
                }

            }


