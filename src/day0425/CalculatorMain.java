package day0425;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// add1 �޼��带 ȣ��
		Calculator calculator = new Calculator();
		// ������ �ִ� �޼��带 ȣ���� ���� ȣ���� ó���� ���� �ڵ� �ʿ�
		int result = calculator.add1();
		System.out.println(result);

//		Calculator calculator1 = new Calculator();
		// add2 �޼��� ȣ��
		int result1 = calculator.add2(10, 20);
		System.out.println(result1);

		int num1 = 10;
		int num2 = 20;
		result = calculator.add2(num1, num2);
		System.out.println(result);

		// add3 �޼��� ȣ��
		calculator.add3(); // return�� ������ ȣ���ϱ⸸ �ϸ� ��.

		// add4 �޼��� ȣ��
		calculator.add4(10, 20);

//		calculator.add4(num1, num2); add4 �ι�° ���

		String strResult = calculator.add5();
		System.out.println(strResult);

		// add6 �޼��� ȣ��
		String strResult1 = calculator.add6("�̰Ը³�", 10);
		System.out.println(strResult1);

		// add7 �޼��� ȣ��

		boolean result2 = calculator.add7(10, 11);
		System.out.println(result2);

	}

}
