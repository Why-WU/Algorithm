import java.util.Scanner;
public class test2 {
     public static void main(String[] args) {
        int a = 10;
        // System.out.println(a++);    
        // System.out.println(++a);
        System.out.print("put:");
        Scanner input = new Scanner(System.in);
        String s = input.next();    //输入字符串
        // int i = input.nextInt();
        System.out.print(s);

        // byte b = 10;
        // b = b+1;
        // b+=1;    //和上面的不同，不存在类型转换
    }
}