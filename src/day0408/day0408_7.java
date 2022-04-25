package day0408;

import java.util.Scanner;

public class day0408_7 {

	public static void main(String[] args) {
		// 정수를 입력하고 마지막에 0을 입력하세요 :
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int num1 = 0; // 입력받는 값
		int num2 = 0; // 입력횟수
		int sum = 0;

		while ((num1 = scan.nextInt()) != 0) {
			sum += num1;
			num2++;
		}
		System.out.println("입력된 수의 개수는 : " + num2 + "개 입니다.");
		System.out.println("평균은 " + sum / num2 + "입니다.");
		System.out.println("합계는 " + sum + "입니다.");

	}

}
