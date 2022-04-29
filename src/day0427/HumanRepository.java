package day0427;

import java.util.ArrayList;
import java.util.List;

public class HumanRepository {
	static List<HumanDTO> humanList = new ArrayList<>();

	void save(HumanDTO human) {
		humanList.add(human);
	}

	void findAll() {
		System.out.println("HumanRepository.findAll()");
		for (HumanDTO h : humanList) {
			System.out.println(h);
		}
	}

	List<HumanDTO> findAll1() {
		return humanList;
	}

	HumanDTO findById(Long id) {
		HumanDTO human = null;

		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				human = humanList.get(i);
			}
		}
		return human;
	}

	// 삭제 메서드
	List<HumanDTO> delete(Long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.remove(i);
			}
		}
		return humanList;
	}

	public void update(Long id, String name) {
		for (int i = 0; i < humanList.size(); i++) {
			if (id.equals(humanList.get(i).getId())) {
				humanList.get(i).setName(name);
			}
		}
	}

}
