package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//求数组中最小的值
public class MinNum {
    public static void main(String[] args) {
        int[] num={8,3,4,1,6,10};//创建并初始化一个一维数组
        System.out.println("输出一维数组");
        for (int i : num) {//循环遍历
            System.out.print(i+"\t");//输出一维数组

        }
        int min=num[0];//先把最小值赋值给0角标
        for (int j = 0; j <num.length-1 ; j++) {//通过for循环遍历数组
            if(min>num[j+1]){//如果0角标上的数字大于1角标上面的数字
                min=num[j+1];//把最小值赋值给1角标
            }

        }
        System.out.println("最小值"+min);
    }
}
