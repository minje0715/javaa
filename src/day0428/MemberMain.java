package day0428;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MemberService ms = new MemberService();
		int selectNumber = 0;
		boolean run = true;

		while (run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.ȸ������ || 2.�α��� || 3.ȸ����� || 4.����ȸ || 5.ȸ���������� || 6.ȸ������ || 7.����|");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("���� �Է� : ");
			selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				ms.signin(); //��ü�̸��� �޼��带 ������
			} else if (selectNumber == 2) {
				ms.login();
			} else if (selectNumber == 3) {
				ms.findAll();
			} else if (selectNumber == 4) {
				ms.findById();
			} else if (selectNumber == 5) {
				ms.update();
			} else if (selectNumber == 6) {
				ms.delete();
			} else if (selectNumber == 7)
				System.out.println("���α׷��� �����մϴ�.");

		}

	}

}
