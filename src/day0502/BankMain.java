package day0502;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BankService bs = new BankService();

		int selectNum = 0;
		boolean run = true;

		while (run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.�ű� �� ��� 2.�ܾ���ȸ 3.�Ա� 4.��� 5.�ŷ�����Ȯ�� 6.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("��ȣ ����> ");
			selectNum = scan.nextInt();
			if (selectNum == 1) {
				bs.save();
			} else if (selectNum == 2) {
				bs.howMuch();
			} else if (selectNum == 3) {
				bs.plusMoney();
			} else if (selectNum == 4) {
				bs.losemoney();
			} else if (selectNum == 5) {
//				bs.bankingList();
			} else if (selectNum == 6) {
				System.out.println("���α׷��� �����մϴ�^^");
			}
		}
	}

}
