public class test4 {
    public static void main(String[] args) {
        int num = 54321;
        int w = num / 10000;
        int q = num / 1000 % 10;
        int b = num / 100 % 10;
        int s = num / 10 % 10;
        int g = num % 10;
        System.out.print("and" + (w + q + b + s + g));
    }
}