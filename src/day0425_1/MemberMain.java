package day0425_1;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member(1L, "id123", "pw123", "�����", "010-1111-1111", 25);
		Member member2 = new Member();
		member2.number = 2L;
		member2.memberId = "id456";
		member2.memberPw = "pw456";
		member2.memberName = "��xx";
		member2.memberPhone = "010-2222-2222";
		member2.memberAge = 25;

		// ��ȸ
		System.out.println(member1.number); // �ʵ尩�� ���� ���¹��
		System.out.println(member1.memberId);

		// ��ȸ(�޼��� ȣ��)
		member1.findById(); // �ش� �޼��忡 �Է��� ������ ����
		member2.findById();

		Scanner scan = new Scanner(System.in);
		System.out.println("���̵� : ");
		String memberId = scan.next();
		System.out.println("��й�ȣ : ");
		String memberPw = scan.next();
		boolean loginResult = member1.memberLogin(memberId, memberPw);
		if (loginResult) {
			System.out.println("�α��μ���");
		} else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���.");
		}

		System.out.println("������ ��ȭ��ȣ : ");
		String memberPhone = scan.next();
		member1.update(memberPhone);
		member1.findById();
	}

}
