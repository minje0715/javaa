package day0504_2;

public class ExceptionEx {

	public static void main(String[] args) {
		/*
		 * 숫자/0 을 했을 때 발생하는 예외를 확인하여 이에 대한 예외처리 코드를 작성해봅시다.
		 */

//		int num = 0; 
//		int num1 = 0;
//		int num2 = 10;
		try {

//			num = num2/num;
			String a = null;
			System.out.println(a.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생!!");

		} catch (NullPointerException e) {
			System.out.println("NullPointerException NPE 발생");
		} finally {
			System.out.println("무조건 실행 완료!");
		}
		System.out.println("리스트가 끝남");
	}

}
