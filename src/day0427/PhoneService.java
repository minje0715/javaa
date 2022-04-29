package day0427;

import java.util.List;

public class PhoneService {

	void save(PhoneDTO phone) {
		System.out.println("PhoneService.save()");
		System.out.println(phone);
		// phone ��ü�� repository�� save �޼���� �Ѱܼ� �� �Ѱ���� Ȯ��
		PhoneRepository pr = new PhoneRepository();
		pr.save(phone);

	}

	void findAll() {
		System.out.println("PhoneService.findall()");
		PhoneRepository pr = new PhoneRepository();
		// Repository���� ����� ���
		pr.findAll();
		// Repository���� ����Ʈ�� �����ͼ� ���⼭ ���
		List<PhoneDTO> phoneList = pr.findAll1();
		System.out.println("PhoneService.findAll() for��");
		for (PhoneDTO p : phoneList) {
			System.out.println(p);
		}
	}
}
