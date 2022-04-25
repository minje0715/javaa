package day0425;

public class Calculator {
	/*
	 * 모든 덧셈 메서드는 10, 20의 합을 구한다. 1. 리턴타입 : int 메서드이름 : add1 매개변수 : 없음
	 */
	int add1() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;
	}

	/*
	 * 2. 리턴타입 : int 메서드이름 : add2 매개변수 : int 타입 2개
	 */
	int add2(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

	/*
	 * 3. 리턴타입:없음 메서드이름:add3 매개변수:없음
	 */
	void add3() {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
	}
	/*
	 * 4. 리턴타입 : 없음 메서드이름 : add4 매개변수 : int 타입 2개
	 */

	void add4(int num1, int num2) {
		System.out.println(num1 + num2);
	}

//	void add4(int num1, int num2) {
//		int sum = 0;
//		sum = num1 + num2;
//		System.out.println(sum);
//	}

	/*
	 * 5. 리턴타입 : String 메서드이름 : add5 매개변수 : 없음
	 */

	String add5() {
		return "나불렀어?";
	}

	/*
	 * 6. 리턴타입 : String 메서드이름 : add6 매개변수 : String 1개, int 1개 실행내용 : String값은 뒤에 !!를
	 * 추가해서 리턴. : int 값은 단순 출력만.
	 */
	String add6(String str, int num1) {
		String str1 = str + "!!";
		System.out.println(num1);
		return str1;
	}

	/*
	 * 7. 리턴타입 : boolean 메서드이름 : add7 매개변수 : int 타입 2개 실행내용 : 매개변수 2개의 합이 10보다 크거나
	 * 같다면 true 리턴 10보다 작으면 false 리턴
	 */

	boolean add7(int num1, int num2) {
		int sum = num1 + num2;
		boolean result = false;
		if (sum >= 10) {
//			return true;
			result = true;
		} else {
//			return false;
			result = false;
		}
		return result;
	}
}