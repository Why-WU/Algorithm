
public class Test2 {
	public static void main(String[] args) {
		int[] aa = {4,6,3,2,1};
		System.out.println(sumNum(aa));
	}
	
	static int sumNum(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
}
