package day0406;

import java.util.Scanner;

public class Ex02_IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("���� �Է�: ");
		num = scan.nextInt();
		if (num <= 0) {
			System.out.println("0���� ū ���� �Է��ϼ���");
		} else if ((num % 2) == 1) {
			System.out.println("Ȧ��");
		} else if ((num % 2) == 0) {
			System.out.println("¦��");
		}
		
		int num1 = 0;
		System.out.print("���� �Է�: ");
		num1 = scan.nextInt();
		if ((num1 % 2) == 0 && num1 > 0) {
			System.out.println("¦��");
		} else if ((num1 % 2) == 1 && num1 > 0) {
			System.out.println("Ȧ��");
		} else {
			System.out.println("0���� ū ���� �Է��ϼ���.");
		}
		
		int num2 = 0;
		System.out.print("���� �Է�: ");
		num2 = scan.nextInt();
		scan.close();
		
		if (num2 > 0) {
			if(num2 % 2 == 0) {
				System.out.println("¦��");
			} else if(num2 % 2 == 1) {
				System.out.println("Ȧ��");
			}
		} else {
			System.out.println("0���� ū ���� �Է����ּ���.");
		}
	}

}