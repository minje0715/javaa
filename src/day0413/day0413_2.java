package day0413;

import java.util.Scanner;

public class day0413_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArray = null; // �л���
		int stu = 0; // �л�����
		int max = 0; // �ִ�
		int score = 0; // �Է��ϴ� ��
		int temp = 0;	
		double vudrbs = 0; // ���
		int sum = 0; // �հ�
		int i = 0; // ����
		
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.��������Ʈ 4.�м� 5.����");
			System.out.println("-----------------------------------");
			System.out.print("���� >");
			score = scan.nextInt();
			if (score == 1) {
				System.out.print("�л��� : ");
				stu = scan.nextInt();
				intArray = new int[stu];
			} else if (score == 2) {
				for (i = 0; i < intArray.length; i++) {
					System.out.print((i + 1) + "��° �л� �����Է� : ");
					intArray[i] = scan.nextInt();
				}
			} else if (score == 3) {
				for (i = 0; i < intArray.length; i++) {
					System.out.println((i + 1) + "��° �л� ���� : " + intArray[i]);
				}
			} else if (score == 4) {
				for (i = 0; i < intArray.length; i++) {
					if (intArray[i] > max) {
						max = intArray[i];
					}
					sum += intArray[i];
				}
				vudrbs = sum / intArray.length;
				System.out.println("�ְ����� : " + max);
				System.out.println("������� : " + vudrbs);
				for (i = 0; i <= intArray.length; i++) {
					for (int j = i + 1; j < intArray.length; j++) {
						if (intArray[i] < intArray[j]) {
							temp = intArray[j];
							intArray[j] = intArray[i];
							intArray[i] = temp;
						}
					}
					System.out.println(intArray[i]);
				}
			}
		}
	}
}