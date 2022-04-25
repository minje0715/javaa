package day0425;

import java.util.Scanner;

public class Calculator1 {
	Scanner scan = new Scanner(System.in);
//	2. 객체 프로그래밍 연습(계산기 예제)
//    1. 사칙연산(+, -, *, /)을 할 수 있는 계산기 
//    2. Calculator Class
//        1. sum 메서드 
//            1. 매개변수: 정수형 변수 2개
//            2. 리턴타입: 없음 
//            3. 실행내용: 덧셈 결과 출력 
	void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
//        2. subtraction 메서드 
//            1. 매개변수: 정수형 변수 2개 
//            2. 리턴타입: 없음
//            3. 실행내용: 뺄셈 결과 출력
	void subtraction(int num1, int num2) {
		int subtraction = num1 - num2;
		System.out.println(subtraction);
	}
//        3. multiplication 메서드 
//            1. 매개변수: 정수형 변수 2개
//            2. 리턴타입: 정수
//            3. 실행내용: 곱셈후 곱셈 결과 리턴 
	int multiplication(int num1, int num2) {
		int multiplication = num1*num2;
		return multiplication;
	}
//        4. division 메서드 
//            1. 매개변수: 없음
//            2. 리턴타입: 정수
//            3. 실행내용: 스캐너로 정수 2개 입력 받고 나눗셈 결과 리턴 
	
	int division() {
		int num1 = 0;
		int num2 = 0;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		int division = num1 / num2;
		return division;
	}
	
	
}
