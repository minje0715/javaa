package day0412;

import java.util.Scanner;

public class day0412_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		int find = 0;
		int i = 0;

		for (i = 0; i < 1000; i++) {
			System.out.print("숫자 : ");
			find = scan.nextInt();
			for (int j = 0; j < num.length; j++) {
				if (find == num[j]) {
					System.out.println(find + "은" + j + "번 인덱스에 있습니다.");
				}
			}

		}
	}

}
