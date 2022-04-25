package day0411;

import java.util.Scanner;

public class day0411_4 {

	public static void main(String[] args) {
		/*
		 * 크기가 5인 정수형 배열을 선언하고 스캐너로 값을 받은뒤 입력받은 값 중에서 가장 큰 값을 출력하시오.
		 */
		Scanner scan = new Scanner(System.in);

		int[] intArray = new int[5];

		int max = 0; // 최댓값 저장할 공간
		
		for (int i = 0; i < intArray.length; i++) { 
			System.out.print("입력>");
			intArray[i] = scan.nextInt();
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 값은 : " + max);
	}

}
