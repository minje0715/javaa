package day0411;

import java.util.Scanner;

public class day0411_4 {

	public static void main(String[] args) {
		/*
		 * ũ�Ⱑ 5�� ������ �迭�� �����ϰ� ��ĳ�ʷ� ���� ������ �Է¹��� �� �߿��� ���� ū ���� ����Ͻÿ�.
		 */
		Scanner scan = new Scanner(System.in);

		int[] intArray = new int[5];

		int max = 0; // �ִ� ������ ����
		
		for (int i = 0; i < intArray.length; i++) { 
			System.out.print("�Է�>");
			intArray[i] = scan.nextInt();
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("���� ū ���� : " + max);
	}

}
