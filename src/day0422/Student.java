package day0422;

public class Student {
	String name = "";
	String major = "";
	String studentNumber = "";
	int age = 0;

//	�⺻ ������
	Student() {

	}

//	�̸�, ���̸� �Ű������� �ϴ� ������
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.major = "��ǻ��";
		this.studentNumber = "1234";
	}

// 	��� �ʵ带 �Ű������� �ϴ� ������
	Student(String name, String major, String studentNumber, int age) {
		this.name = name;
		this.major = major;
		this.studentNumber = studentNumber;
		this.age = age;
	}

	// �ʵ尪 ����� ���� �޼���
	void studentPrint() {
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.studentNumber);
		System.out.println(this.age);
	}

}
