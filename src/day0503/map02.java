package day0503;

import java.util.HashMap;
import java.util.Map;

public class map02 {

	public static void main(String[] args) {

//	StudentDTO student1 = new StudentDTO(1L, "������", "010-1111-1111", "��ǻ�Ͱ���");         // ���1
//	StudentDTO student2 = new StudentDTO(2L, "�����", "010-2222-2222", "ȣ�ڿܽ�������");

		Map<Long, StudentDTO> studentMap = new HashMap<>();

		Long id = 1L;
		String studentName = "�л�1";
		String studentNumber = "010-1111-1111";
		String major = "��ǻ�Ͱ���";

//		StudentDTO student = new StudentDTO(id, studentName, studentNumber, major);
//		studentMap.put(id, student);

		id = 2L;
		studentName = "�л�2";
		studentNumber = "010-2222-2222";
		major = "���ڰ���";

//		StudentDTO student1 = new StudentDTO(id, studentName, studentNumber, major);
//		studentMap.put(id, student1);

		/*
		 * // ���1 Long id student = new StudentDTO(id, sutduentName, StudentNumber,
		 * major);
		 * 
		 * studentmap.put(1L, student1); studentmap.put(2L, student2);
		 */ for (Long l : studentMap.keySet()) {
			System.out.println(l);
			System.out.println(studentMap.get(l));
		}

	}

}
