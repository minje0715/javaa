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
			System.out.print("1���� 100���� �����Է�:");
			num1 = scan.nextInt();
			if (num1 < answer) {
				System.out.println("UP : ");
			} else if (num1 > answer) {
				System.out.println("DOWN : ");
			} else if (num1 == answer) {
				System.out.println("������ϴ�");
				run = false;
			}
			try1++;
		}
		System.out.println("�õ�Ƚ���� " + try1 + "ȸ�Դϴ�");
	}

}
