package day0422;

public class StudentMain {

	public static void main(String[] args) {
//		�⺻�����ڸ� ȣ���� ��ü
//	1. Student Class
//	    1. �̸�(name), ����(major), �й�(studentNumber), ����(age) �ʵ带 ������ ����. 
//	    2. ������ 
//	        1. �⺻������ 
//	        2. �̸�, ���̸� �Ű������� �ϴ� ������ 
//	            1. �̸�, ���� �ʵ� ���� �Ű������� ���� ���� ������ �����ϰ� 
//	            2. ������ ��ǻ��, �й��� 1234�� �����Ѵ�. 
//	        3. �̸�, ����, �й�, ���̸� �Ű������� �ϴ� ������ 
//	            1. 4���� ���� ��� �Ű������� ���� �޾Ƽ� �ʵ� ������ ������. 
//	2. StudentMain Class
//	    1. student1: �⺻�����ڸ� ȣ���Ͽ� ������ ��ü 
//	        1. �ʵ� 4���� ���� ���� ���� �Է��غ��� ��µ� �غ����� 
//	    2. student2: �Ű����� 2���� �����ڸ� ȣ���Ͽ� ������ ��ü 
//	        1. �ʵ� 4���� ���� ���� ��� �غ����� 
//	    3. student3: �Ű����� 4���� �����ڸ� ȣ���Ͽ� ������ ��ü 
//	        1. �ʵ� 4���� ���� ���� ��� �غ�����
		// �⺻�����ڸ� ȣ���Ͽ� ������ ��ü
		Student student1 = new Student();
		student1.name = "�л�1";
		student1.major = "���ڰ���";
		student1.studentNumber = "00999999";
		student1.age = 22;
//		student1.studentPrint();
		System.out.println(student1.name);
		System.out.println(student1.major);
		System.out.println(student1.studentNumber);
		System.out.println(student1.age);

		// �Ű����� 2���� �����ڸ� ȣ���� ��ü
//		Student student2 = new Student("�л�2", 20);
		Student student2 = new Student("�л�2", 20);
		System.out.println(student2.name);
		System.out.println(student2.major);
		System.out.println(student2.studentNumber);
		System.out.println(student2.age);
//		student2.studentPrint();

		// �Ű����� 4���� �����ڸ� ȣ���� ��ü
//		Student student3 = new Student("�л�3", "����ȭ", "1234", 20);
		Student student3 = new Student("�л�3", "����ȭ", "1234", 20);
		System.out.println(student3.name);
		System.out.println(student3.major);
		System.out.println(student3.studentNumber);
		System.out.println(student3.age);
//		student3.studentPrint();
		
		

	}
}
