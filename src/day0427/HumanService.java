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
		System.out.println("넘어온 id값 : " + id);
		// Repository로 부터 id가 1L인 humanDTO객체를 가져옴
		HumanDTO human = hr.findById(id);
		if (human == null) {
			System.out.println("조회결과가 없습니다.");
		} else {
			System.out.println("조회값 :" + human);
		}
	}

	// 삭제 메서드
	public void delete(Long id) {
		List<HumanDTO> humanList = hr.delete(id);
		System.out.println("삭제후 리스트");
		for (HumanDTO human : humanList) {
			System.out.println(human);
		}
	}

	void update(Long id, String name) {
		hr.update(id, name);
	}

}
