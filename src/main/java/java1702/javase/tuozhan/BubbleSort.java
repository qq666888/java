package java1702.javase.tuozhan;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
//使用冒泡方法进行排序
public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={45,3,6,8,2,5,1};
        System.out.println("原数组是：");
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];

            for (int j = 0; j < arr.length; j++) {
                int i2 = arr[j];
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                System.out.println(arr[j]);

            }
            System.out.println("【");
            for (int j = arr.length-1; j < arr.length; j++) {
                int i2 = arr[j];
                System.out.println(arr[j]);
                
            }
            System.out.println("】");

        }
    }


}
