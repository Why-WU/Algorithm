public class test1 {
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

        byte b2 = 11;
        short s2 = b2;
        int i2 = s2;
        long l2 = i2;
        char c2 = 'a';
        int i3 = c2;
        System.out.print(i3);

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

自动类型转换：容量小的类型自动转换成容量大的数据类型
byte short int 在计算时会转换成int类型
如果把int转成float，或long转成double，不需要强制转换，但可能丢失精度

float 和 double  近似值   其它的是 精确值
只要是货币，不能用float和double

容量大的类型转换成容量小的数据类型时，要加上强制转换符，布尔类型不能转为任何其它类型
*/