package day0406;

import java.util.Scanner;

public class Ex06_IfExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int result = 0;
		System.out.print("ù��° ����: ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ����: ");
		num2 = scan.nextInt();
		System.out.print("����° ����: ");
		num3 = scan.nextInt();
		scan.close();
		
		if (num1 > num2) {
			if (num1 > num3) {
				result = num1;
			} else {
				result = num3;
			}
		} else if (num2 > num3) {
			result = num2;
		} else {
			result = num3;
		}
		System.out.println("���� ū ���� " + result + "�Դϴ�.");
	}

}
