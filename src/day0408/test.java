package day0408;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// 1.���� 2.��� 3.�ܰ� 4.����

		Scanner scan = new Scanner(System.in);

		int money = 0;
		int bank = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("-----------------------");
			System.out.print("���� >");
			money = scan.nextInt();
			
			if(money == 1) {
				System.out.println("���ݾ�>");
				money = scan.nextInt();
				bank += money;
				System.out.println("�����ܾ��� " + bank + "�� �Դϴ�");
			}else if(money == 2) {
				System.out.println("��ݾ�>");
				money = scan.nextInt();
				
				if(money > bank) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("���� �ܾ��� " + bank + "�� �Դϴ�");
				}else {
					bank -= money;
					System.out.println("�����ܾ��� " + bank + "�� �Դϴ�");
				}
			}else if(money == 3) {
				System.out.println("�����ܾ��� " + bank + "�� �Դϴ�");
			}else if(money == 4) {
				System.out.println("����");
				run = false;
			}else {
				System.out.println("1~4�� �߿��� ������");
			}
		}
	}

}
