package day0504;

import java.util.HashMap;
import java.util.Map;

public class Temp {

	public static void main(String[] args) {
		Map<Long, String> testMap = new HashMap<>();
		
		System.out.println(testMap.put(1L, "�ȳ�"));
		System.out.println(testMap.put(2L, "����"));
		System.out.println(testMap.put(1L, "�ȳ��ϼ���"));
		//���ο� ���� put ���� ���� null �� �����°� ����
		//�� ���Ŀ� ���� �����ϸ� ���� �������� ��� �Ҷ��� �� ���� ���� �����
	}

}
