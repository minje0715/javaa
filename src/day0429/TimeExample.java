package day0429;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeExample {

	public static void main(String[] args) {
		// ���� ��¥ ����ϱ�
		LocalDate date = LocalDate.now();
		System.out.println(date);
		//���� �ð� ����ϱ�
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss"));
		System.out.println(time);
		
		
	}

}
