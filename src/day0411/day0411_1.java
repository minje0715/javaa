package day0411;

import java.util.Scanner;

public class day0411_1 {

	public static void main(String[] args) {
		/*
		 * 1. ���� 2. ��� 3. �ܰ� 4. ����
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0; // �Է�
		int num2 = 0; // ����
		int num3 = 0; // ���
		int num4 = 0; // �ܰ�
		int num5 = 0; // ����
		boolean run = true;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("----------------------");
			System.out.print("���� >");
			num1 = scan.nextInt();
			if (num1 == 1) {
				System.out.print("���ݾ�> ");
				num2 = scan.nextInt();
				num4 += num2; //
				System.out.println("�����ܾ���> " + num4 + "��");
			} else if (num1 == 2) {
				System.out.print("��ݾ�> ");
				num3 = scan.nextInt();
				if (num4 < num3) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("�����ܾ��� " + num4 + "��");
				} else {
					num4 -= num3;
					System.out.println("�����ܾ��� " + num4 + "��");
				}
			} else if (num1 == 3) {
				System.out.println("�����ܾ��� " + num4 + "��");
			} else if (num1 == 4) {
				System.out.println("����");
				run = false;
			} else
				System.out.println("1, 2, 3, 4�� �߿� ������");

		}
	}

}
