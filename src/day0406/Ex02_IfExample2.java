package day0406;

import java.util.Scanner;

public class Ex02_IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("정수 입력: ");
		num = scan.nextInt();
		if (num <= 0) {
			System.out.println("0보다 큰 수를 입력하세요");
		} else if ((num % 2) == 1) {
			System.out.println("홀수");
		} else if ((num % 2) == 0) {
			System.out.println("짝수");
		}
		
		int num1 = 0;
		System.out.print("정수 입력: ");
		num1 = scan.nextInt();
		if ((num1 % 2) == 0 && num1 > 0) {
			System.out.println("짝수");
		} else if ((num1 % 2) == 1 && num1 > 0) {
			System.out.println("홀수");
		} else {
			System.out.println("0보다 큰 수를 입력하세요.");
		}
		
		int num2 = 0;
		System.out.print("정수 입력: ");
		num2 = scan.nextInt();
		scan.close();
		
		if (num2 > 0) {
			if(num2 % 2 == 0) {
				System.out.println("짝수");
			} else if(num2 % 2 == 1) {
				System.out.println("홀수");
			}
		} else {
			System.out.println("0보다 큰 수를 입력해주세요.");
		}
	}

}
