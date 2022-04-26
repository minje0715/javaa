package day0425_1;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member(1L, "id123", "pw123", "김민제", "010-1111-1111", 25);
		Member member2 = new Member();
		member2.number = 2L;
		member2.memberId = "id456";
		member2.memberPw = "pw456";
		member2.memberName = "김xx";
		member2.memberPhone = "010-2222-2222";
		member2.memberAge = 25;

		// 조회
		System.out.println(member1.number); // 필드갑을 직접 보는방법
		System.out.println(member1.memberId);

		// 조회(메서드 호출)
		member1.findById(); // 해당 메서드에 입력한 값들이 나옴
		member2.findById();

		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 : ");
		String memberId = scan.next();
		System.out.println("비밀번호 : ");
		String memberPw = scan.next();
		boolean loginResult = member1.memberLogin(memberId, memberPw);
		if (loginResult) {
			System.out.println("로그인성공");
		} else {
			System.out.println("아이디 또는 비밀번호를 확인하세요.");
		}

		System.out.println("변경할 전화번호 : ");
		String memberPhone = scan.next();
		member1.update(memberPhone);
		member1.findById();
	}

}
