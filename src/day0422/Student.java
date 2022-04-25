package day0422;

public class Student {
	String name = "";
	String major = "";
	String studentNumber = "";
	int age = 0;

//	기본 생성자
	Student() {

	}

//	이름, 나이를 매개변수로 하는 생성자
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.major = "컴퓨터";
		this.studentNumber = "1234";
	}

// 	모든 필드를 매개변수로 하는 생성자
	Student(String name, String major, String studentNumber, int age) {
		this.name = name;
		this.major = major;
		this.studentNumber = studentNumber;
		this.age = age;
	}

	// 필드값 출력을 위한 메서드
	void studentPrint() {
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.studentNumber);
		System.out.println(this.age);
	}

}
