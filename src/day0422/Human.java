package day0422;

public class Human {
	//�̸�, ����, ����, ����
	String name = "";
	int age = 0;
	String local = "";
	String gender = "";
	
//	// ������ ����
	Human() {
		System.out.println("������ ȣ���");
	}
//	
//	// �ʵ尪�� �����ϱ� ���� �Ű������� �ִ� ������ ����
	Human(String name, int age, String local, String gender) {
		System.out.println("�Ű����� �ִ� ������");
		System.out.println(name);
		System.out.println(age);
		System.out.println(local);
		System.out.println(gender);
		//�Ű������� ���޹��� ���� �ʵ忡 ����
		this.name = name;
		this.age = age;
		this.local = local;
		this.gender = gender;
	}
//	
//	
//	//�Ű������� �ִ� ������
	Human(String str1) {
		System.out.println("�Ѱܹ��� ���� " + str1);
	}
//	
////	Human(String str2) {
////		System.out.println("�Ѱܹ��� ���� " + str2);
////	}
//	
	// int �Ű������� �ִ� ������
	Human(int num1) {
		System.out.println("�Ѱܹ��� ���� " + num1);
	}
	
	
}
