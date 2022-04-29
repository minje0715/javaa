package day0429;

import java.util.Scanner;

public class PostMain {

	public static void main(String[] args) {
		PostService ps = new PostService();
		Scanner sc = new Scanner(System.in);
		int selectNum = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.글작성 2.글목록 3.글조회 4.글수정 5.글검색 6.글삭제 7.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("번호 선택 -> ");
			selectNum = sc.nextInt();
			if(selectNum == 1) {
				ps.save();
			}else if(selectNum == 2) {
				ps.findAll();
			}else if(selectNum == 3) {
				ps.findPost();
			}else if(selectNum == 4) {
				ps.update();
			}else if(selectNum == 5) {
				ps.findWriter();
			}else if(selectNum == 6) {
				ps.delete();
			}else if(selectNum == 7) {
				System.out.println("종료하겠습니다.");
			}
		}
		
	}

}
