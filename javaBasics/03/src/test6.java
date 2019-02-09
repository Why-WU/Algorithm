package src;

/**
 * test6 
 * ArrayIndexOutOfBoundsException 数组越界
 */
public class test6 {
    public static void main(String[] args) {
        int[] no = { 1, 2, 3, 4 };
        int len = no.length;
        for (int i = 0; i <= len; i++) {
            System.out.println(no[i]);
        }
    }
}