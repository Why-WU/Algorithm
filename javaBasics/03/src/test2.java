package src;

/**
 * test2
 * 
 * 笔记：
 * 方法重载，返回值不能作为重载条件
 */
public class test2 {
    public static void main(String[] args) {
        // print(1, 2);
        long a = 1L;
        print(a);
    }

    public static void print(int a) {
        System.out.println(a);
        System.out.println(".........");
    }

    public static void print(long a) {  //方法名相同，参数类型不同
        System.out.println(a);
        System.out.println("========");
    }

    public static void print(int a, int b) { // 方法名相同，参数个数不同
        System.out.println(a);
        System.out.println(b);
        System.out.println("++++++++");
    }
}