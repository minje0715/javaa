package day0503;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		StudentService ss = new StudentService();

		int selectNum = 0;
		boolean run = true;

		while (run) {

			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.ȸ������ || 2.�α��� || 3.ȸ����� || 4.����ȸ || 5.ȸ���������� || 6.ȸ������ || 7.����|");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("���� �Է� : ");
			selectNum = scan.nextInt();
			if (selectNum == 1) {
				ss.signin(); // ��ü�̸��� �޼��带 ������
			} else if (selectNum == 2) {
				ss.login();
			} else if (selectNum == 3) {
				ss.findAll();
			} else if (selectNum == 4) {
				ss.findById();
			} else if (selectNum == 5) {
				ss.update();
			} else if (selectNum == 6) {
				ss.delete();
			} else if (selectNum == 7) {
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
			}
		}
	}

}
