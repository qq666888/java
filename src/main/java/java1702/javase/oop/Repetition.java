package java1702.javase.oop;

/**
 * Created by $qiqi
 * on 2017/4/5.
 * java
 */
public class Repetition {
    public static void main(String[] args) {
        int arr[]={7,10,1,};
        System.out.println("一维数组中的元素分别是：");
        for(int x:arr){//元素类型，元素变量：遍历对象；foreach遍历数组
            System.out.print(x+"\t");
        }
    }
}
