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
		System.out.print("첫번째 정수: ");
		num1 = scan.nextInt();
		System.out.print("두번째 정수: ");
		num2 = scan.nextInt();
		System.out.print("세번째 정수: ");
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
		System.out.println("가장 큰 수는 " + result + "입니다.");
	}

}
