package day0503;

import java.util.HashMap;
import java.util.Map;

public class map01 {

	public static void main(String[] args) {
		// key: ����(int), value: ����(String)
		// ����(Generic) �ȿ��� Ŭ������ �� �� ����
		Map<Integer, String> map1 = new HashMap<>();
		// Map = �������̽� ;  HashMap�� Map�� ������ Ŭ����
		
		// 1�̶�� key���� �ȳ��̶�� ������ ����.
		map1.put(1, "�ȳ�");
		map1.put(2, "�ȳ��ϼ���");
		
		//��������
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		// key: ����(String), value: ����(String)
		// map2 ���� �ϰ� data�� �����غ��ô�

		Map<String, String> map2 = new HashMap<>();
		
		map2.put("�ȳ�", "�ϼ���");
		map2.put("�ȳ���", "����");	
		map2.put("�ȳ�", "�̤̤̤�");
		
		
		System.out.println(map2.get("�ȳ�"));
		
		// �ݺ����� Ȱ�� keySet()
		for(String s: map2.keySet()) {
			System.out.println(s);
			System.out.println(map2.get(s));
		}
		
		// ����
		map2.remove("�ȳ�");
		
		
	}

}
