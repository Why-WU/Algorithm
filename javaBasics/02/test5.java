import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        System.out.println("zhou:" + day / 7);
        System.out.println("ʣ��:" + day % 7 + "tian");
    }
}