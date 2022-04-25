package day0408;

import java.util.Scanner;

public class day0408_10 {

	public static void main(String[] args) {

		System.out.println("Up & Down");

		Scanner scan = new Scanner(System.in);

		int answer = (int) (Math.random() * 100) + 1;
		int num1 = 0;
		int try1 = 0;

		boolean run = true;
		while (run) {
			System.out.print("1부터 100까지 숫자입력:");
			num1 = scan.nextInt();
			if (num1 < answer) {
				System.out.println("UP : ");
			} else if (num1 > answer) {
				System.out.println("DOWN : ");
			} else if (num1 == answer) {
				System.out.println("맞췄습니다");
				run = false;
			}
			try1++;
		}
		System.out.println("시도횟수는 " + try1 + "회입니다");
	}

}
