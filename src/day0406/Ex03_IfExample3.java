package day0406;

import java.util.Scanner;

public class Ex03_IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		String result = "";
		System.out.print("������ �Է��ϼ���: ");
		score = scan.nextInt();
		scan.close();
		
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				if (score >= 95) {
					result = "A+";
				} else {
					result = "A0";
				}
			} else if (score >= 80) {
				result = "B";
			} else if (score >= 70) {
				result = "C";
			} else if (score >= 60) {
				result = "D";
			} else {
				result = "F";
			}
			System.out.println(result + "�����Դϴ�.");
		} else {
			System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�.");
		}
	}
}
