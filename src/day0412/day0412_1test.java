package day0412;

import java.util.Scanner;

public class day0412_1test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		

		System.out.print("���� �Է� : ");
		int bae = scan.nextInt();

		for (int i = 0; i < num.length; i++) {
			if (bae == num[i]) {
				System.out.println(bae + "��" + i + "�� �ε����� �ֽ��ϴ�.");
			}
		}
	}
}
