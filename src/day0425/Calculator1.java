package day0425;

import java.util.Scanner;

public class Calculator1 {
	Scanner scan = new Scanner(System.in);
//	2. ��ü ���α׷��� ����(���� ����)
//    1. ��Ģ����(+, -, *, /)�� �� �� �ִ� ���� 
//    2. Calculator Class
//        1. sum �޼��� 
//            1. �Ű�����: ������ ���� 2��
//            2. ����Ÿ��: ���� 
//            3. ���೻��: ���� ��� ��� 
	void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
//        2. subtraction �޼��� 
//            1. �Ű�����: ������ ���� 2�� 
//            2. ����Ÿ��: ����
//            3. ���೻��: ���� ��� ���
	void subtraction(int num1, int num2) {
		int subtraction = num1 - num2;
		System.out.println(subtraction);
	}
//        3. multiplication �޼��� 
//            1. �Ű�����: ������ ���� 2��
//            2. ����Ÿ��: ����
//            3. ���೻��: ������ ���� ��� ���� 
	int multiplication(int num1, int num2) {
		int multiplication = num1*num2;
		return multiplication;
	}
//        4. division �޼��� 
//            1. �Ű�����: ����
//            2. ����Ÿ��: ����
//            3. ���೻��: ��ĳ�ʷ� ���� 2�� �Է� �ް� ������ ��� ���� 
	
	int division() {
		int num1 = 0;
		int num2 = 0;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int division = num1 / num2;
		return division;
	}
	
	
}
