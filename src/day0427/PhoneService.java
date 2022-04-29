package day0427;

import java.util.List;

public class PhoneService {

	void save(PhoneDTO phone) {
		System.out.println("PhoneService.save()");
		System.out.println(phone);
		// phone 객체를 repository의 save 메서드로 넘겨서 잘 넘겼는지 확인
		PhoneRepository pr = new PhoneRepository();
		pr.save(phone);

	}

	void findAll() {
		System.out.println("PhoneService.findall()");
		PhoneRepository pr = new PhoneRepository();
		// Repository에서 목록을 출력
		pr.findAll();
		// Repository에서 리스트를 가져와서 여기서 출력
		List<PhoneDTO> phoneList = pr.findAll1();
		System.out.println("PhoneService.findAll() for문");
		for (PhoneDTO p : phoneList) {
			System.out.println(p);
		}
	}
}
