package day0408;

import java.util.Scanner;

public class day0408_2 {

	public static void main(String[] args) {
		/*
		 * � ������ �ϳ� �Է¹޾Ƽ� 1���� �Է¹��� ���������� 
		 * ���� �߿��� 2�ǹ��, 3�ǹ���� ������ ������ �� ���� ����Ͻÿ�
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0;
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}
}