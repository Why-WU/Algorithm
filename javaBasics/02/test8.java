/**
 * 打印100以内所有的奇数，偶数和3的倍数
 */
public class test8 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println("偶数：" + i);
            } else{      
                System.out.println("奇数:"+i ) ;
            }  
  
             if(i%3==0){
                System.out.println("3的倍数:"+i);
            }
            i++;
        }
    }
}