import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("h");
        int h = input.nextInt();
        System.out.print("r");
        int r = input.nextInt();
        System.out.print("V = " + 3.14 * r * r * h);
    }

}