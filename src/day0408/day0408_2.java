package day0408;

import java.util.Scanner;

public class day0408_2 {

	public static void main(String[] args) {
		/*
		 * 어떤 정수를 하나 입력받아서 1부터 입력받은 정수까지의 
		 * 정수 중에서 2의배수, 3의배수를 제외한 정수의 총 합을 출력하시오
		 */
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0;
		num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}
}