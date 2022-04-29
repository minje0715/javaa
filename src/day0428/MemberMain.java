package day0428;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MemberService ms = new MemberService();
		int selectNumber = 0;
		boolean run = true;

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.회원가입 || 2.로그인 || 3.회원목록 || 4.상세조회 || 5.회원정보수정 || 6.회원삭제 || 7.종료|");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("숫자 입력 : ");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				ms.signin(); //객체이름과 메서드를 적어줌
			} else if (selectNumber == 2) {
				ms.login();
			} else if (selectNumber == 3) {
				ms.findAll();
			} else if (selectNumber == 4) {
				ms.findById();
			} else if (selectNumber == 5) {
				ms.update();
			} else if (selectNumber == 6) {
				ms.delete();
			} else if (selectNumber == 7)
				System.out.println("프로그램을 종료합니다.");

		}

	}

}
