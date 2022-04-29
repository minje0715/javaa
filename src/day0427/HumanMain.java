package day0427;

import day0422.Human;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository�� humanList�� ���ο� ��ü�� �����غ��ô�.

		HumanDTO human1 = new HumanDTO(1L, "�޸�1", 25);
		HumanDTO human2 = new HumanDTO(2L, "�޸�2", 25);
		HumanDTO human3 = new HumanDTO(3L, "�޸�3", 25);
		HumanService hs = new HumanService();
		hs.save(human1);
		hs.save(human2);
		hs.save(human3);

		hs.findAll();
		// id�� 1�� ��� ��ȸ
		// ��ȸ�� �����ʹ� Service���� ���
		// hs.findById(1L);
		hs.findById(4L);
		// id�� 2�� ��� ����
		// ���� �� ����Ʈ�� �����ͼ� Service���� ���
		hs.delete(2L);

		// id�� 3�� ����� �̸��� �ڹٿ� ���� �ٲ���.
		hs.update(3L, "�ڹٿ�");
		hs.findAll();
	}

}
