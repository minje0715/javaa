package day0413;

import java.util.Scanner;

public class day0413_1 {

	public static void main(String[] args) {
		//스캐너로 입력받은 값으로 배열 크기 지정하기
		//크기5인 정수형 배열
		Scanner scan = new Scanner(System.in);
		int size = 0;
		int[] numbers2 = null;
			size = scan.nextInt();
			numbers2 = new int[size];
			System.out.println(numbers2.length);
	}
}