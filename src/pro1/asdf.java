package pro1;

import java.util.Arrays;

public class asdf {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 1, 5, 4 };
		int temp = 0;

		System.out.println("배열전 " + Arrays.toString(arr));

		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("배열후 " + Arrays.toString(arr));

	}

}
