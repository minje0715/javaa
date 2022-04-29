package day0428;

import java.util.List;
import java.util.Scanner;

import day0427.HumanDTO;

public class MemberService {
	MemberRepository mr = new MemberRepository();
	Scanner scan = new Scanner(System.in);

	void signin() {
		Long id = null;
		System.out.print("아이디 입력 : ");
		String memberId = scan.next();
		boolean idcheck = mr.idcheck(memberId);
		if (idcheck == true) {
			System.out.println("중복된 아이디입니다.");
		} else {

			System.out.print("비밀번호 입력 : ");
			String memberPassword = scan.next();
			System.out.print("이름 입력 : ");
			String memberName = scan.next();
			System.out.print("나이 입력 : ");
			String memberAge = scan.next();
			System.out.print("핸드폰번호 입력 : ");
			String memberMobile = scan.next();
			System.out.println("회원가입이 완료되었습니다.");
			MemberDTO member = new MemberDTO(id, memberId, memberPassword, memberName, memberAge, memberMobile);
			mr.save(member);
		}
	}
	
	void findAll() {
		List<MemberDTO> memberList = mr.findAll();
		for (MemberDTO member : memberList) {
			System.out.println(member);
		}

	}

	void login() {
		System.out.print("아이디를 입력하세요 : ");
		String memberId = scan.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String memberPassword = scan.next();
		boolean logincheck = mr.m(memberId, memberPassword);
		if (logincheck) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

	void findById() {
		System.out.print("아이디를 입력해주세요 : ");
		Long id = scan.nextLong();
		mr.findById(id);
	}

	void update() {
		System.out.print("아이디를 입력하세요 : ");
		String memberId = scan.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String memberPassword = scan.next();
		boolean logincheck = mr.m(memberId, memberPassword);
		if (logincheck) {
			System.out.print("전화번호를 수정하세요 : ");
			String memberMobile = scan.next();
			mr.change(memberId, memberMobile);
		} else {
			System.out.println("로그인 실패");
		}
	}

	void delete() {
		System.out.print("관리번호를 입력하세요 : ");
		Long id = scan.nextLong();
		mr.remove(id);
		List<MemberDTO> memberList = mr.findAll();
		for (MemberDTO member : memberList) {
			System.out.println(member);
		}
	}
}
