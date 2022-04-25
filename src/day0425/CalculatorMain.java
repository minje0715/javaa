package day0425;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// add1 메서드를 호출
		Calculator calculator = new Calculator();
		// 리턴이 있는 메서드를 호출할 때는 호출결과 처리를 위한 코드 필요
		int result = calculator.add1();
		System.out.println(result);

//		Calculator calculator1 = new Calculator();
		// add2 메서드 호출
		int result1 = calculator.add2(10, 20);
		System.out.println(result1);

		int num1 = 10;
		int num2 = 20;
		result = calculator.add2(num1, num2);
		System.out.println(result);

		// add3 메서드 호출
		calculator.add3(); // return이 없으면 호출하기만 하면 끝.

		// add4 메서드 호출
		calculator.add4(10, 20);

//		calculator.add4(num1, num2); add4 두번째 방법

		String strResult = calculator.add5();
		System.out.println(strResult);

		// add6 메서드 호출
		String strResult1 = calculator.add6("이게맞나", 10);
		System.out.println(strResult1);

		// add7 메서드 호출

		boolean result2 = calculator.add7(10, 11);
		System.out.println(result2);

	}

}
