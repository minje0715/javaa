package day0411;

import java.util.Scanner;

public class day0411_3 {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하고
		//스캐너로 값을 배열에 저장해서 합계와 평균 계산
		
		Scanner scan = new Scanner(System.in);
		
		int[] intArray = new int[5];
		
		int i = 0;
		int sum = 0;
		System.out.print("숫자입력 : ");
		for(i = 0; i < intArray.length; i++) { 
//			int a = scan.nextInt();
//			intArray[i] = a;
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + sum/intArray.length);
	}

}
