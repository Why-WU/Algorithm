package src;

/**
 * test4
 */
public class test4 {

    public static void main(String[] args) {
		print(1, 3,2,4,5);
    }

    public static void print(int b, int c, int... a) { // 可变变量
        System.out.println(a);
        for (int x : a) {
            System.out.println(x);
        }
    }
}

/**
 * 笔记： 
 * 可变参数必须放到参数的最后一个
 * 可变参数当数组使用
 */