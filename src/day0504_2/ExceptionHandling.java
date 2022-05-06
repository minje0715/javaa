package day0504_2;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
	// try catch�� �ʼ� finally�� ����
	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<>();
			list.add("�ȳ�");
			list.add("����");
			for (int i = 0; i <= list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException ���� �߻�!!!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception ���� �߻�!!!");
			e.printStackTrace();
		} finally {
			System.out.println("����� ���� �߻��ϵ� ���ϵ� ����");
		}
		System.out.println("����Ʈ ��� ��");
	}

}
