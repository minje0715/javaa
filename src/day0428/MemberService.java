package day0428;

import java.util.List;
import java.util.Scanner;

import day0427.HumanDTO;

public class MemberService {
	MemberRepository mr = new MemberRepository();
	Scanner scan = new Scanner(System.in);

	void signin() {
		Long id = null;
		System.out.print("���̵� �Է� : ");
		String memberId = scan.next();
		boolean idcheck = mr.idcheck(memberId);
		if (idcheck == true) {
			System.out.println("�ߺ��� ���̵��Դϴ�.");
		} else {

			System.out.print("��й�ȣ �Է� : ");
			String memberPassword = scan.next();
			System.out.print("�̸� �Է� : ");
			String memberName = scan.next();
			System.out.print("���� �Է� : ");
			String memberAge = scan.next();
			System.out.print("�ڵ�����ȣ �Է� : ");
			String memberMobile = scan.next();
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
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
		System.out.print("���̵� �Է��ϼ��� : ");
		String memberId = scan.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String memberPassword = scan.next();
		boolean logincheck = mr.m(memberId, memberPassword);
		if (logincheck) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
	}

	void findById() {
		System.out.print("���̵� �Է����ּ��� : ");
		Long id = scan.nextLong();
		mr.findById(id);
	}

	void update() {
		System.out.print("���̵� �Է��ϼ��� : ");
		String memberId = scan.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String memberPassword = scan.next();
		boolean logincheck = mr.m(memberId, memberPassword);
		if (logincheck) {
			System.out.print("��ȭ��ȣ�� �����ϼ��� : ");
			String memberMobile = scan.next();
			mr.change(memberId, memberMobile);
		} else {
			System.out.println("�α��� ����");
		}
	}

	void delete() {
		System.out.print("������ȣ�� �Է��ϼ��� : ");
		Long id = scan.nextLong();
		mr.remove(id);
		List<MemberDTO> memberList = mr.findAll();
		for (MemberDTO member : memberList) {
			System.out.println(member);
		}
	}
}
