/**
 * Created by SONY on 2017/3/8.
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int i =0;
        i +=1;//i=i+1  选中目标按shif6+f6改名字
        i -=2;
        i *=5;
        i /=4;//0.01=0，小数点后面的去掉，取整
        i %=5;

        System.out.println(i);

        boolean b=true;
        b &=false;//针对布尔值或定点类型值
        System.out.println(b);


    }
}
