package day0429;

import java.util.Scanner;

public class PostMain {

	public static void main(String[] args) {
		PostService ps = new PostService();
		Scanner sc = new Scanner(System.in);
		int selectNum = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.���ۼ� 2.�۸�� 3.����ȸ 4.�ۼ��� 5.�۰˻� 6.�ۻ��� 7.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("��ȣ ���� -> ");
			selectNum = sc.nextInt();
			if(selectNum == 1) {
				ps.save();
			}else if(selectNum == 2) {
				ps.findAll();
			}else if(selectNum == 3) {
				ps.findPost();
			}else if(selectNum == 4) {
				ps.update();
			}else if(selectNum == 5) {
				ps.findWriter();
			}else if(selectNum == 6) {
				ps.delete();
			}else if(selectNum == 7) {
				System.out.println("�����ϰڽ��ϴ�.");
			}
		}
		
	}

}
