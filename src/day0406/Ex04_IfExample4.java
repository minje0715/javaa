package day0406;

import java.util.Scanner;

public class Ex04_IfExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		System.out.print("정수 입력하세요: ");
		num = scan.nextInt();
		scan.close();
		
//		if (num <= 0) {
//			System.out.println("0보다 큰 수를 입력하세요.");
//		} else if (num % 3 == 0 && num % 5 == 0) {
//			System.out.println("입력한 숫자는 3과 5의 공배수입니다.");
//		} else if (num % 3 == 0) {
//			System.out.println("입력한 숫자는 3의 배수입니다.");
//		} else if (num % 5 == 0) {
//			System.out.println("입력한 숫자는 5의 배수입니다.");
//		} else {
//			System.out.println("입력한 숫자는 3의배수도 아니고 5의 배수도 아닙니다.");
//		}
		
		if (num > 0) {
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println("3과 5의 공배수입니다.");
			} else if (num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else if (num % 5 == 0) {
				System.out.println("5의 배수입니다.");
			} else if (num % 3 != 0 && num % 5 != 0) {
				System.out.println("3과 5의 배수가 아닙니다.");
			}
		} else {
			System.out.println("0보다 큰 수를 입력하세요.");
		}
	}

}
