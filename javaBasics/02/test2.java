public class test2 {
    private int c = 30; // 成员变量

    public static void main(String[] args) {
        // int a = 10; // 内部变量
        // int b = 20;
        int myAdd = 50;//驼峰式命名
        // System.out.print(a);
        boolean flag = true; //false
        byte d = 10;
        short e = 20;
        long f = 100000000;
        char g = 'A';
        float h = 20.0f;
        double i = 30.0d;
        //面试题
        byte a = 10;
        byte b = 20;
        a = (byte)(a+b); //1.会自动转化成int参与运算 2.强制类型转换
        System.out.print(a);
        int j = 0x20;

    }
}
/* 笔记：
布尔型          boolean     不定值      true/false      默认false
字节型          byte        1字节       -128~127        默认值0
短整型          short       2字节       -32768~32767    默认值0
整形            int         4字节       范围很大        默认值0
长整型          long        8字节       范围更大        默认值0
字符型          char        2字节       0~65535        默认值 '\u0000'
单精度浮点型     float       4字节       ...           默认值0.0F
双精度浮点型     double      8字节       ...           默认值0.0D

八进制要以0开头
十六进制以0x或0X开头
*/