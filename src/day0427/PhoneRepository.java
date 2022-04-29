package day0427;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository {
	 List<PhoneDTO> phoneList = new ArrayList<>();

	void save(PhoneDTO phone) {
		System.out.println("PhoneService.save()");
		System.out.println(phone);
		phoneList.add(phone);
	}

	void findAll() {
		System.out.println("PhoneRepository.findAll()");
		for (PhoneDTO p : phoneList) {
			System.out.println(p);
		}
	}

	// findAll1 메서드 정의
	// 리턴 : phoneList
	List<PhoneDTO> findAll1() {
		return phoneList;
	}
}