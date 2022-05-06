package day0503;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		StudentService ss = new StudentService();

		int selectNum = 0;
		boolean run = true;

		while (run) {

			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.회원가입 || 2.로그인 || 3.회원목록 || 4.상세조회 || 5.회원정보수정 || 6.회원삭제 || 7.종료|");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("숫자 입력 : ");
			selectNum = scan.nextInt();
			if (selectNum == 1) {
				ss.signin(); // 객체이름과 메서드를 적어줌
			} else if (selectNum == 2) {
				ss.login();
			} else if (selectNum == 3) {
				ss.findAll();
			} else if (selectNum == 4) {
				ss.findById();
			} else if (selectNum == 5) {
				ss.update();
			} else if (selectNum == 6) {
				ss.delete();
			} else if (selectNum == 7) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
	}

}
