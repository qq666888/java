package java1702.javase.oop;

/**
 * Created by SONY on 2017/3/8.
 */
public class Zy2 {
    public static void main(String[] args)
    {
        /*for ( int i =100; i<=999; i++)
        {
           int a= i/100,
            b =(i%100)/10,
            c= (i%100)%10;
            if (i==(a*a*a)+(b*b*b)+(c*c*c))
            {
                System.out.println(i);
            }
        }*/
        for (int i =1000; i<=9999; i++)
        {
            int a=i/1000,
                  b=i/100%10,
                c=i/10%10,

                    d=i%10;
            if (i==(a*a*a*a)+(b*b*b*b)+(c*c*c*c)+(d*d*d*d))
            {
                System.out.println(i);

            }
        }
    }
}
