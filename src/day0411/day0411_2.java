package day0411;

import java.util.Scanner;

public class day0411_2 {

	public static void main(String[] args) {
		/*
		 * 정수형 배열 배열이름 : numbers 크기 : 5
		 */
		int[] number = null; // 둘이 같은 표현!! 배열 객체만 선언한 상태
		int number1[] = null; // int num; 과 비슷한 상태
		double[] number2 = null; // int[] number; 도 가능함
		String[] strArray = null;
//		초기값을 갖는 배열 객체 선언
		int[] intArray = { 1, 7, 9, 4, 5 }; // 반드시 중괄호 안에다가 콤마로 나열 할 수 있음
//		                  [0][1][2][3][4]

//		intArray배열의 2번 인덱스에 저장된 값 출력
		System.out.println(intArray[2]);
//		intArray배열의 4번인덱스에 저장된 값 출력
		System.out.println(intArray[4]);
//		System.out.println(intArray[5]); // 5번 배열 없어서 Error

//		intArray[3]에 저장된 데이터를
//		정수형 변수 num1에 저장하고 num1에 저장된 데이터를 출력
		int num1 = intArray[3];
		System.out.println(num1);

		System.out.println(intArray[2]);
		intArray[2] = 10;
		System.out.println(intArray[2]);

//		배열 크기 확인(배열에 데이터가 몇개 있느냐)
		System.out.println(intArray.length);

		int[] intArray1 = new int[3]; // 객체를 만들 때 new를 써야함
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);

		double[] doubleArray1 = new double[3];
		System.out.println(doubleArray1[0]);
		System.out.println(doubleArray1[1]);
		System.out.println(doubleArray1[2]);

//		int[] intArray2 = null;			// 값이 없어서 Error 
//		System.out.println(intArray2[0]);  
//		System.out.println(intArray2[1]);
//		System.out.println(intArray2[2]);

//		23, 11, 351, 99가 저장된 정수형 배열을 선언하고
//		이 배열에 저장된 값을 for문을 이용해서 출력해봅시다

		// 첫번째
		int[] intArray3 = { 23, 11, 351, 99 };
//		for (int i = 0; i <= 3; i++) {
//			System.out.println(intArray3[i]);
//		}
		// 두번째
		int[] intArray4 = new int[4];
		intArray4[0] = 23;
		intArray4[1] = 11;
		intArray4[2] = 351;
		intArray4[3] = 99;
		// 세번째
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
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + sum/intArray5.length);
	}
}
