package day0408;

import java.util.Scanner;

public class day0408_8 {

	public static void main(String[] args) {
		// Random �޼���
		// 1���� 10������ �����߿��� �ϳ��� ���
		int randomNumber = (int) (Math.random() * 10) + 1;
		System.out.println(randomNumber);

		System.out.println(Math.random()); // 0.0<= <1.0
		System.out.println(Math.random() * 10); // 0.0<= <10.0
		System.out.println((int) (Math.random() * 10));// 0<= <10
		System.out.println((int) (Math.random() * 10) + 1);// 1<= <11
		System.out.println((int) (Math.random() * 100) + 1);// 1<= <100
	}
}
