package day0503;

import java.util.HashMap;
import java.util.Map;

public class map01 {

	public static void main(String[] args) {
		// key: 정수(int), value: 문자(String)
		// 꺽새(Generic) 안에는 클래스만 올 수 있음
		Map<Integer, String> map1 = new HashMap<>();
		// Map = 인터페이스 ;  HashMap은 Map을 구현한 클래스
		
		// 1이라는 key값에 안녕이라는 벨류를 넣음.
		map1.put(1, "안녕");
		map1.put(2, "안녕하세요");
		
		//가져오기
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		// key: 문자(String), value: 문자(String)
		// map2 선언 하고 data를 저장해봅시다

		Map<String, String> map2 = new HashMap<>();
		
		map2.put("안녕", "하세요");
		map2.put("안녕하", "세요");	
		map2.put("안녕", "ㅜㅜㅜㅜ");
		
		
		System.out.println(map2.get("안녕"));
		
		// 반복문에 활용 keySet()
		for(String s: map2.keySet()) {
			System.out.println(s);
			System.out.println(map2.get(s));
		}
		
		// 삭제
		map2.remove("안녕");
		
		
	}

}
