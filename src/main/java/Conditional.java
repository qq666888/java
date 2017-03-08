/**
 * Created by SONY on 2017/3/8.
 */
public class Conditional { //常见
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = (x > y) ? 10 : 100;//(条件)?(真值):(假数值)，前面条件如果符合真，取冒号前面的值，如果是假的，取冒号后面的值
        System.out.println(z);
    }
}
