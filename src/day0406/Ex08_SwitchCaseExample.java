package day0406;

import java.util.Scanner;

public class Ex08_SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.print("����ܾ �Է��ϼ���: ");
		str = scan.next();
		scan.close();
		
		switch(str){
		case "desk":
			System.out.println("å��");
			break;
		case "chair":
			System.out.println("����");
			break;
		case "monitor":
			System.out.println("�����");
			break;
		case "mouse":
			System.out.println("���콺");
			break;
		default:
			System.out.println("������ ���� �ܾ��Դϴ�.");
			break;
		}
	}

}