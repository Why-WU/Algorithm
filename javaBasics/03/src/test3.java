package src;

/**
 * test3
 * ��������
 */
public class test3 {
    public static void main(String[] args) {
        /* //��һ��
        int[] no = new int[5];   //������һ������Ϊ5�����飬��Ϊno
        no[0] = 1;
        no[1] = 2;
        no[2] = 3;
        no[3] = 4;
        no[4] = 5; */

        //�ڶ���
        /* int[] no = new int[]{1,2,3,4,5};  //�����ʱ��ֱ�ӳ�ʼ��5��ֵ */

        //������
        /* int[] no = {1,2,3,4,5}; */

        //������
        int[] no ;
        no = new int[5];

        //����ı��� ����ͨforѭ����
        for(int i = 0;i<no.length;i++){
            System.out.println(no[i]);
        }
    }
}