package day0411;

import java.util.Scanner;

public class day0411_2 {

	public static void main(String[] args) {
		/*
		 * ������ �迭 �迭�̸� : numbers ũ�� : 5
		 */
		int[] number = null; // ���� ���� ǥ��!! �迭 ��ü�� ������ ����
		int number1[] = null; // int num; �� ����� ����
		double[] number2 = null; // int[] number; �� ������
		String[] strArray = null;
//		�ʱⰪ�� ���� �迭 ��ü ����
		int[] intArray = { 1, 7, 9, 4, 5 }; // �ݵ�� �߰�ȣ �ȿ��ٰ� �޸��� ���� �� �� ����
//		                  [0][1][2][3][4]

//		intArray�迭�� 2�� �ε����� ����� �� ���
		System.out.println(intArray[2]);
//		intArray�迭�� 4���ε����� ����� �� ���
		System.out.println(intArray[4]);
//		System.out.println(intArray[5]); // 5�� �迭 ��� Error

//		intArray[3]�� ����� �����͸�
//		������ ���� num1�� �����ϰ� num1�� ����� �����͸� ���
		int num1 = intArray[3];
		System.out.println(num1);

		System.out.println(intArray[2]);
		intArray[2] = 10;
		System.out.println(intArray[2]);

//		�迭 ũ�� Ȯ��(�迭�� �����Ͱ� � �ִ���)
		System.out.println(intArray.length);

		int[] intArray1 = new int[3]; // ��ü�� ���� �� new�� �����
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);

		double[] doubleArray1 = new double[3];
		System.out.println(doubleArray1[0]);
		System.out.println(doubleArray1[1]);
		System.out.println(doubleArray1[2]);

//		int[] intArray2 = null;			// ���� ��� Error 
//		System.out.println(intArray2[0]);  
//		System.out.println(intArray2[1]);
//		System.out.println(intArray2[2]);

//		23, 11, 351, 99�� ����� ������ �迭�� �����ϰ�
//		�� �迭�� ����� ���� for���� �̿��ؼ� ����غ��ô�

		// ù��°
		int[] intArray3 = { 23, 11, 351, 99 };
//		for (int i = 0; i <= 3; i++) {
//			System.out.println(intArray3[i]);
//		}
		// �ι�°
		int[] intArray4 = new int[4];
		intArray4[0] = 23;
		intArray4[1] = 11;
		intArray4[2] = 351;
		intArray4[3] = 99;
		// ����°
		int[] intArray5 = null;
		intArray5 = new int[4];
		intArray5[0] = 23;
		intArray5[1] = 11;
		intArray5[2] = 351;
		intArray5[3] = 99;

		System.out.println(intArray5[0]);
		System.out.println(intArray5[1]);
		System.out.println(intArray5[2]);
		System.out.println(intArray5[3]);
		
		int i = 0;
		int sum = 0;
		for (i = 0; i < intArray5.length; i++) {
			System.out.println(intArray5[i]);
			sum += intArray5[i];
		}
		System.out.println("�հ� :" + sum);
		System.out.println("��� :" + sum/intArray5.length);
	}
}
