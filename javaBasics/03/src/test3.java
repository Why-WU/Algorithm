package src;

/**
 * test3
 * 定义数组
 */
public class test3 {
    public static void main(String[] args) {
        /* //第一种
        int[] no = new int[5];   //定义了一个长度为5的数组，名为no
        no[0] = 1;
        no[1] = 2;
        no[2] = 3;
        no[3] = 4;
        no[4] = 5; */

        //第二种
        /* int[] no = new int[]{1,2,3,4,5};  //定义的时候，直接初始化5个值 */

        //第三种
        /* int[] no = {1,2,3,4,5}; */

        //第四种
        int[] no ;
        no = new int[5];

        //数组的遍历 （普通for循环）
        for(int i = 0;i<no.length;i++){
            System.out.println(no[i]);
        }
    }
}