package day0425_1;

import java.util.Scanner;

public class Member {
 Scanner scan = new Scanner(System.in);
//	3. ��ü ���α׷��� ����(ȸ������)
//    1. ȸ���� ȸ����ȣ, ���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ, ���� ������ ������. 
//    2. �ֿ��� 
//        1. ȸ������(save)
//            1. ȸ�����Խ� �ΰ��� ����� ����. 
//                1. ��ü�� ���� �� ��� ������ �Ű������� �����Ͽ� �ʵ尪 �����ϱ� 
//                2. ��ü�� ����� �� �� �ʵ尪�� ���� �����ϱ�   

	long number;
	String memberId;
	String memberPw;
	String memberName;
	String memberPhone;
	int memberAge;
	
	//�⺻������
	Member(){
		
	}
	// ��� �ʵ带 �Ű������� �ϴ� ������
	Member(long number, String memberId, String memberPw, String memberName,
			String memberPhone, int memberAge) {
		this.number= number;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = memberAge;
	}

//	 3. ȸ����ȸ(findById)
//   1. �ش� ��ü�� ȸ����ȸ �޼��带 ȣ���ϸ� �ش� ȸ���� ��ü ������ �����.
	void findById() {
		
		System.out.print("ȸ����ȣ : ");
		System.out.println(this.number);
		System.out.print("���̵� : ");
		System.out.println(this.memberId);
		System.out.print("��й�ȣ : ");
		System.out.println(this.memberPw);
		System.out.print("�̸� : ");
		System.out.println(this.memberName);
		System.out.print("��ȭ��ȣ : ");
		System.out.println(this.memberPhone);
		System.out.print("���� : ");
		System.out.println(this.memberAge);
	}
//	 2. �α���(memberLogin)
//   1. �α��� �޼��带 ȣ���� �� ���Խ� �Է��� ���̵�, ��й�ȣ�� 
//	 �Ű������� �����ϰ� boolean ������ �޾Ƽ� �α��� ����, ���� ���θ� �����. 
	//String  �񱳴� equals �� ���ִ°� ����
	boolean memberLogin(String memberId, String memberPw) {
		boolean loginResult = false;
		if(this.memberId.equals(memberId) && this.memberPw.equals(memberPw)) {
			loginResult = true;
		}else {
			loginResult = false;
		}
		return loginResult;
	}
	
//  4. ��������(update)
//   1. ���������� ��ȭ��ȣ�� �ȴٰ� �����ϰ� 
//   2. �������� �޼��� ȣ��� �����ϰ��� �ϴ� ��ȭ��ȣ�� �Ű������� �Ѱܼ� �ش� �ʵ尪�� �����ϵ��� �Ѵ�. 
// 	 3. ���� �� ȸ����ȸ �޼��带 ȣ���Ͽ� ���� ����ƴ��� Ȯ����.	
	void update(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	
}
