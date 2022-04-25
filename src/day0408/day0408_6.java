package day0408;

import java.util.Scanner;

public class day0408_6 {
	// static final String ANSWER = "종료"; 이 페이지에서 이 값은 꼭 써야한다 할 때 사용
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");

		Scanner scan = new Scanner(System.in);

		boolean run = true; // 모든 변수에 붙일 수 있음 var
		String str1 = ""; // 변수 값이 변할 수 있으면 let
		String str2 = "종료"; // 변수 값이 변하지 않을거면 const

		while (run) {
			System.out.print(">");
			str1 = scan.nextLine();
			System.out.println(str1);
			if (str1.equals(str2)) {
				run = false;
			}
		}
	}
}
