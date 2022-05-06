package day0503;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day0428.MemberDTO;

public class StudentService {
	Scanner scan = new Scanner(System.in);
	StudentMap sm = new StudentMap();
	Long id = 0L;

	void signin() {
		System.out.print("아이디 입력 : ");
		String memberId = scan.next();
		boolean idcheck = sm.idcheck(memberId);
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
			StudentDTO member = new StudentDTO(++id, memberId, memberPassword, memberName, memberAge, memberMobile);
			sm.save(id, member);
		}
	}

	public void login() {
		System.out.print("아이디를 입력하세요: ");
		String memberId = scan.next();
		System.out.print("비밀번호를 입력하세요: ");
		String memberPassword = scan.next();
		boolean logincheck = sm.idPw(memberId, memberPassword);
		if (logincheck) {
			System.out.println("아이디와 비밀번호가 일치합니다");
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디와 비밀번호가 틀립니다.");
		}
	}

	public void findAll() {
		Map<Long, StudentDTO> StudentMap = sm.findAll();
		for (Long l : StudentMap.keySet()) {
			System.out.println(StudentMap.get(l));
		}

	}

	public void findById() {
		System.out.println("관리번호 혹은 아이디를 입력해주세요: ");
		String memberId = scan.next();
		sm.findById(id);

	}

	public void update() {
		System.out.print("아이디를 입력하세요 : ");
		String memberId = scan.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String memberPassword = scan.next();
		boolean logincheck = sm.updatecheck(memberId, memberPassword);
		if (logincheck) {
			System.out.print("전화번호를 수정하세요 : ");
			String memberMobile = scan.next();
			sm.change(memberId, memberMobile);
		} else {
			System.out.println("로그인 실패");
		}

	}

	public void delete() {
		System.out.print("관리번호를 입력하세요 : ");
		Long id = scan.nextLong();
		sm.remove(id);
		Map<Long, StudentDTO> studentMap = sm.findAll();
		for (Long l : studentMap.keySet()) {
			System.out.println(studentMap);
		}

	}

}