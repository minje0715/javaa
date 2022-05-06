package day0504;

import java.util.HashMap;
import java.util.Map;

public class Temp {

	public static void main(String[] args) {
		Map<Long, String> testMap = new HashMap<>();
		
		System.out.println(testMap.put(1L, "안녕"));
		System.out.println(testMap.put(2L, "ㅎㅇ"));
		System.out.println(testMap.put(1L, "안녕하세요"));
		//새로운 값을 put 했을 때는 null 이 나오는게 정상
		//그 이후에 값을 대입하면 덮어 씌우지만 출력 할때는 그 전에 값을 출력함
	}

}
