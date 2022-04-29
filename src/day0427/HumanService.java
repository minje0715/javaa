package day0427;

import java.util.List;

public class HumanService {
	HumanRepository hr = new HumanRepository();

	void save(HumanDTO human) {
		hr.save(human);
	}

	void findAll() {
		List<HumanDTO> humanList = hr.findAll1();
		for (HumanDTO human : humanList) {
			System.out.println(human);
		}
	}

	void findById(Long id) {
		System.out.println("�Ѿ�� id�� : " + id);
		// Repository�� ���� id�� 1L�� humanDTO��ü�� ������
		HumanDTO human = hr.findById(id);
		if (human == null) {
			System.out.println("��ȸ����� �����ϴ�.");
		} else {
			System.out.println("��ȸ�� :" + human);
		}
	}

	// ���� �޼���
	public void delete(Long id) {
		List<HumanDTO> humanList = hr.delete(id);
		System.out.println("������ ����Ʈ");
		for (HumanDTO human : humanList) {
			System.out.println(human);
		}
	}

	void update(Long id, String name) {
		hr.update(id, name);
	}

}
