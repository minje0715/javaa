package day0504_2;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {
	// try catch는 필수 finally는 선택
	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<>();
			list.add("안녕");
			list.add("하이");
			for (int i = 0; i <= list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException 예외 발생!!!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception 예외 발생!!!");
			e.printStackTrace();
		} finally {
			System.out.println("여기는 예외 발생하든 안하든 실행");
		}
		System.out.println("리스트 출력 끝");
	}

}
