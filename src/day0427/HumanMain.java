package day0427;

import day0422.Human;

public class HumanMain {

	public static void main(String[] args) {
		// HumanRepository의 humanList에 새로운 객체를 저장해봅시다.

		HumanDTO human1 = new HumanDTO(1L, "휴먼1", 25);
		HumanDTO human2 = new HumanDTO(2L, "휴먼2", 25);
		HumanDTO human3 = new HumanDTO(3L, "휴먼3", 25);
		HumanService hs = new HumanService();
		hs.save(human1);
		hs.save(human2);
		hs.save(human3);

		hs.findAll();
		// id가 1인 사람 조회
		// 조회한 데이터는 Service에서 출력
		// hs.findById(1L);
		hs.findById(4L);
		// id가 2인 사람 삭제
		// 삭제 후 리스트를 가져와서 Service에서 출력
		hs.delete(2L);

		// id가 3인 사람의 이름을 자바왕 으로 바꾸자.
		hs.update(3L, "자바왕");
		hs.findAll();
	}

}
