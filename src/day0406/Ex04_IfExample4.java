package day0406;

import java.util.Scanner;

public class Ex04_IfExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("���� �Է��ϼ���: ");
		num = scan.nextInt();
		scan.close();
		
//		if (num <= 0) {
//			System.out.println("0���� ū ���� �Է��ϼ���.");
//		} else if (num % 3 == 0 && num % 5 == 0) {
//			System.out.println("�Է��� ���ڴ� 3�� 5�� ������Դϴ�.");
//		} else if (num % 3 == 0) {
//			System.out.println("�Է��� ���ڴ� 3�� ����Դϴ�.");
//		} else if (num % 5 == 0) {
//			System.out.println("�Է��� ���ڴ� 5�� ����Դϴ�.");
//		} else {
//			System.out.println("�Է��� ���ڴ� 3�ǹ���� �ƴϰ� 5�� ����� �ƴմϴ�.");
//		}
		
		if (num > 0) {
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println("3�� 5�� ������Դϴ�.");
			} else if (num % 3 == 0) {
				System.out.println("3�� ����Դϴ�.");
			} else if (num % 5 == 0) {
				System.out.println("5�� ����Դϴ�.");
			} else if (num % 3 != 0 && num % 5 != 0) {
				System.out.println("3�� 5�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("0���� ū ���� �Է��ϼ���.");
		}
	}

}