package day0411;

import java.util.Scanner;

public class day0411_1 {

	public static void main(String[] args) {
		/*
		 * 1. 예금 2. 출금 3. 잔고 4. 종료
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0; // 입력
		int num2 = 0; // 예금
		int num3 = 0; // 출금
		int num4 = 0; // 잔고
		int num5 = 0; // 종료
		boolean run = true;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("----------------------");
			System.out.print("선택 >");
			num1 = scan.nextInt();
			if (num1 == 1) {
				System.out.print("예금액> ");
				num2 = scan.nextInt();
				num4 += num2; //
				System.out.println("현재잔액은> " + num4 + "원");
			} else if (num1 == 2) {
				System.out.print("출금액> ");
				num3 = scan.nextInt();
				if (num4 < num3) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재잔액은 " + num4 + "원");
				} else {
					num4 -= num3;
					System.out.println("현재잔액은 " + num4 + "원");
				}
			} else if (num1 == 3) {
				System.out.println("현재잔액은 " + num4 + "원");
			} else if (num1 == 4) {
				System.out.println("종료");
				run = false;
			} else
				System.out.println("1, 2, 3, 4번 중에 고르세요");

		}
	}

}
