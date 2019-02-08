/**
 * 计算10的阶乘
 */
public class test7 {
    public static void main(String[] args) {
        int i = 1;
        int num = 1;
        while (i < 10) {
            num *= i;
            i++;
        }
        System.out.print(num);
    }
}