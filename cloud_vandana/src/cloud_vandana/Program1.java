package cloud_vandana;

import java.util.Random;

public class Program1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		Random rand = new Random();

		for (int i = n - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
