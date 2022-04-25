package pro1;

public class Hello {

	public static void main(String[] args) {
		//var num = 10;
		//const num1 = 20;
		// let num2 = 30;
		//num3 = 10;
		//타입 변수명 = 변수값;
		// 타입: 변수값의 종류
		/*
		 * 숫자 : 정수(int, long), 실수(float, double)
		 * 문자 : 한글자(char), 문장(string)
		 * 논리 : 참(true), 거짓(false)(boolean)
		 */
		
		// 정수형(int) 변수 num을 선언하여 num에 10을 저장.
		// 타입 변수 이름 = 변수값;
		int num = 10; //java 변수 선언 방식
		// num에 담긴 값 출력
		System.out.println(num);
		System.out.println("num");
		// num에 100을 대입하기
		num = 100; // num을 또 선언하여 오류
		int num2 = 200;// num2를 선언하지 않고 값을 대입하려 해서 오류
		System.out.println(num);
		
		//long 타입 변수
		long long1 = 100L; //long 타입은 숫자뒤에 L을 붙여줘야함
		System.out.println(long1); //int와 long의 차이는 저장할 수 있는 범위의 차이
		
		//float(4byte) f, (double(8byte)
		
		//char,   String
		char char1 = 'a'; //'asdf' 오류남 'b' 무조건 한글자만
		System.out.println(char1);
		String str1 = "안녕하세요, 여기는 아무거나 다 들어가요";
		System.out.println();
		
		//boolean
		boolean bool1 = true;
		boolean bool2 = false;
		
		// int, long, float, double, boolean, char: 기본형 타입(primitive type)
		// String: 참조형 타입
	}

}










