package day0408;

import java.util.Scanner;

public class day0408_7 {

	public static void main(String[] args) {
		// ������ �Է��ϰ� �������� 0�� �Է��ϼ��� :
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int num1 = 0; // �Է¹޴� ��
		int num2 = 0; // �Է�Ƚ��
		int sum = 0;

		while ((num1 = scan.nextInt()) != 0) {
			sum += num1;
			num2++;
		}
		System.out.println("�Էµ� ���� ������ : " + num2 + "�� �Դϴ�.");
		System.out.println("����� " + sum / num2 + "�Դϴ�.");
		System.out.println("�հ�� " + sum + "�Դϴ�.");

	}

}