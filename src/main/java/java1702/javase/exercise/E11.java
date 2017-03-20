package java1702.javase.exercise;

/**
 * Created by SONY on 2017/3/14.
 */
public class E11 {
    public static void main(String[] args) {
         int l=0;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4; j++) {
                for (int k = 1; k <=4; k++) {

                        if(i!=j && j!=k && i!=k) {
                         l +=1;
                            System.out.println(i*100+j*10+k);



                    }

                }

            }

        }
    }
}
