package day0504_2;

public class ExceptionEx {

	public static void main(String[] args) {
		/*
		 * ����/0 �� ���� �� �߻��ϴ� ���ܸ� Ȯ���Ͽ� �̿� ���� ����ó�� �ڵ带 �ۼ��غ��ô�.
		 */

//		int num = 0; 
//		int num1 = 0;
//		int num2 = 10;
		try {

//			num = num2/num;
			String a = null;
			System.out.println(a.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ���� �߻�!!");

		} catch (NullPointerException e) {
			System.out.println("NullPointerException NPE �߻�");
		} finally {
			System.out.println("������ ���� �Ϸ�!");
		}
		System.out.println("����Ʈ�� ����");
	}

}
