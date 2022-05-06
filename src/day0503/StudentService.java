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
		System.out.print("���̵� �Է� : ");
		String memberId = scan.next();
		boolean idcheck = sm.idcheck(memberId);
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
			StudentDTO member = new StudentDTO(++id, memberId, memberPassword, memberName, memberAge, memberMobile);
			sm.save(id, member);
		}
	}

	public void login() {
		System.out.print("���̵� �Է��ϼ���: ");
		String memberId = scan.next();
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
		String memberPassword = scan.next();
		boolean logincheck = sm.idPw(memberId, memberPassword);
		if (logincheck) {
			System.out.println("���̵�� ��й�ȣ�� ��ġ�մϴ�");
			System.out.println("�α��� ����");
		} else {
			System.out.println("���̵�� ��й�ȣ�� Ʋ���ϴ�.");
		}
	}

	public void findAll() {
		Map<Long, StudentDTO> StudentMap = sm.findAll();
		for (Long l : StudentMap.keySet()) {
			System.out.println(StudentMap.get(l));
		}

	}

	public void findById() {
		System.out.println("������ȣ Ȥ�� ���̵� �Է����ּ���: ");
		String memberId = scan.next();
		sm.findById(id);

	}

	public void update() {
		System.out.print("���̵� �Է��ϼ��� : ");
		String memberId = scan.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String memberPassword = scan.next();
		boolean logincheck = sm.updatecheck(memberId, memberPassword);
		if (logincheck) {
			System.out.print("��ȭ��ȣ�� �����ϼ��� : ");
			String memberMobile = scan.next();
			sm.change(memberId, memberMobile);
		} else {
			System.out.println("�α��� ����");
		}

	}

	public void delete() {
		System.out.print("������ȣ�� �Է��ϼ��� : ");
		Long id = scan.nextLong();
		sm.remove(id);
		Map<Long, StudentDTO> studentMap = sm.findAll();
		for (Long l : studentMap.keySet()) {
			System.out.println(studentMap);
		}

	}

}