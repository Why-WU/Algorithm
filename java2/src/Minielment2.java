
public class Minielment2 {
	public static void main(String[] args) {
		int[] aa = { -1, -4, 6, 3, 2, 1, -7 };

		System.out.println(miniMum(aa));
	}

	static int miniMum(int[] arr) {
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				smin = min;
				min = arr[i];
			} else if (arr[i] < smin) {
				smin = arr[i];
			}
		}
		return smin;
	}
}
