package day0503;

import java.util.HashMap;
import java.util.Map;

public class map02 {

	public static void main(String[] args) {

//	StudentDTO student1 = new StudentDTO(1L, "강아지", "010-1111-1111", "컴퓨터공학");         // 방법1
//	StudentDTO student2 = new StudentDTO(2L, "고양이", "010-2222-2222", "호텔외식조리과");

		Map<Long, StudentDTO> studentMap = new HashMap<>();

		Long id = 1L;
		String studentName = "학생1";
		String studentNumber = "010-1111-1111";
		String major = "컴퓨터공학";

//		StudentDTO student = new StudentDTO(id, studentName, studentNumber, major);
//		studentMap.put(id, student);

		id = 2L;
		studentName = "학생2";
		studentNumber = "010-2222-2222";
		major = "전자공학";

//		StudentDTO student1 = new StudentDTO(id, studentName, studentNumber, major);
//		studentMap.put(id, student1);

		/*
		 * // 방법1 Long id student = new StudentDTO(id, sutduentName, StudentNumber,
		 * major);
		 * 
		 * studentmap.put(1L, student1); studentmap.put(2L, student2);
		 */ for (Long l : studentMap.keySet()) {
			System.out.println(l);
			System.out.println(studentMap.get(l));
		}

	}

}
