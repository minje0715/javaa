package day0411;

import java.util.Scanner;

public class day0411_3 {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����ϰ�
		//��ĳ�ʷ� ���� �迭�� �����ؼ� �հ�� ��� ���
		
		Scanner scan = new Scanner(System.in);
		
		int[] intArray = new int[5];
		
		int i = 0;
		int sum = 0;
		System.out.print("�����Է� : ");
		for(i = 0; i < intArray.length; i++) { 
//			int a = scan.nextInt();
//			intArray[i] = a;
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		System.out.println("�հ�� : " + sum);
		System.out.println("����� : " + sum/intArray.length);
	}

}