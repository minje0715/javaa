package day0501;

import java.util.Scanner;

public class postMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postService ps = new postService();
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		boolean run = true;

		while (run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.���ۼ� 2.�۸�� 3.����ȸ 4.�ۼ��� 5.�۰˻� 6.�ۻ��� 7.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("��ȣ ���� -> ");
			sel = sc.nextInt();

			if (sel == 1) {
				ps.save();
			} else if (sel == 2) {
				ps.findAll();
			} else if (sel == 3) {
				ps.findById();
			} else if (sel == 4) {
				ps.update();
			} else if (sel == 5) {
				ps.search();
			} else if (sel == 6) {
				ps.delete();
			} else if (sel == 7) {

			}

		}
	}
}