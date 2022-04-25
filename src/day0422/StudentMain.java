package day0422;

public class StudentMain {

	public static void main(String[] args) {
//		기본생성자를 호출한 객체
//	1. Student Class
//	    1. 이름(name), 전공(major), 학번(studentNumber), 나이(age) 필드를 가지고 있음. 
//	    2. 생성자 
//	        1. 기본생성자 
//	        2. 이름, 나이만 매개변수로 하는 생성자 
//	            1. 이름, 나이 필드 값은 매개변수로 전달 받은 값으로 저장하고 
//	            2. 전공은 컴퓨터, 학번은 1234로 저장한다. 
//	        3. 이름, 전공, 학번, 나이를 매개변수로 하는 생성자 
//	            1. 4개의 값을 모두 매개변수로 전달 받아서 필드 값으로 저장함. 
//	2. StudentMain Class
//	    1. student1: 기본생성자를 호출하여 생성한 객체 
//	        1. 필드 4개에 대한 값을 각각 입력해보고 출력도 해보세요 
//	    2. student2: 매개변수 2개인 생성자를 호출하여 생성한 객체 
//	        1. 필드 4개에 대한 값을 출력 해보세요 
//	    3. student3: 매개변수 4개인 생성자를 호출하여 생성한 객체 
//	        1. 필드 4개에 대한 값을 출력 해보세요
		// 기본생성자를 호출하여 생성한 객체
		Student student1 = new Student();
		student1.name = "학생1";
		student1.major = "전자공학";
		student1.studentNumber = "00999999";
		student1.age = 22;
//		student1.studentPrint();
		System.out.println(student1.name);
		System.out.println(student1.major);
		System.out.println(student1.studentNumber);
		System.out.println(student1.age);

		// 매개변수 2개인 생성자를 호출한 객체
//		Student student2 = new Student("학생2", 20);
		Student student2 = new Student("학생2", 20);
		System.out.println(student2.name);
		System.out.println(student2.major);
		System.out.println(student2.studentNumber);
		System.out.println(student2.age);
//		student2.studentPrint();

		// 매개변수 4개인 생성자를 호출한 객체
//		Student student3 = new Student("학생3", "동양화", "1234", 20);
		Student student3 = new Student("학생3", "동양화", "1234", 20);
		System.out.println(student3.name);
		System.out.println(student3.major);
		System.out.println(student3.studentNumber);
		System.out.println(student3.age);
//		student3.studentPrint();
		
		

	}
}
