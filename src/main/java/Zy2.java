/**
 * Created by SONY on 2017/3/8.
 */
public class Zy2 {
    public static void main(String[] args)
    {
        for ( int i =100; i<=999; i++)
        {
           int a= i/100,
            b =(i%100)/10,
            c= (i%100)%10;
            if (i==(a*a*a)+(b*b*b)+(c*c*c))
            {
                System.out.println(i);
            }
        }
    }
}
