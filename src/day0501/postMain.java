package day0501;

import java.util.Scanner;

public class postMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postService ps = new postService();
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		boolean run = true;

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.글작성 2.글목록 3.글조회 4.글수정 5.글검색 6.글삭제 7.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("번호 선택 -> ");
			sel = sc.nextInt();

			if (sel == 1) {
				ps.save();
			} else if (sel == 2) {
				ps.findAll();
			} else if (sel == 3) {
				ps.findById();
			} else if (sel == 4) {
				ps.update();
			} else if (sel == 5) {
				ps.search();
			} else if (sel == 6) {
				ps.delete();
			} else if (sel == 7) {

			}

		}
	}
}