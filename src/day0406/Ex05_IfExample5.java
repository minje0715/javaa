package day0406;

import java.util.Scanner;

public class Ex05_IfExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int grade = 0;
		int score = 0;
		System.out.print("�г��� �Է��ϼ���: ");
		grade = scan.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		score = scan.nextInt();
		scan.close();
		
//		if(grade >= 1 && grade <= 4 && score >= 0 && score <= 100) {
//			if (grade == 4) {
//				if (score >= 70) {
//					System.out.println(grade + "�г� �հ�");
//				} else {
//					System.out.println(grade + "�г� ���հ�");
//				}
//			} else {
//				if (score >= 60) {
//					System.out.println(grade + "�г� �հ�");
//				} else {
//					System.out.println(grade + "�г� ���հ�");
//				}
//			}
//		} else {
//			System.out.println("�г��� 1~4�г��� �ƴϰų�, ������ 0~100�� ���̰� �ƴմϴ�.");
//		}
		
		if(score >= 60) {
			if(grade != 4) {
				System.out.println("�հ�");
			} else if(score >= 70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		} else {
			System.out.println("���հ�");
		}
	}

}