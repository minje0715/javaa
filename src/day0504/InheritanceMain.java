package day0504;

public class InheritanceMain {

	public static void main(String[] args) {
		// �θ� Ŭ���� ��ü
		ParentClass parent = new ParentClass();
		ParentClass parent1 = new ParentClass("������", "��õ");
		
		// �ڽ� Ŭ���� ��ü
		ChildClass child = new ChildClass();
		ChildClass child1 = new ChildClass("�����", "����");
		
		//�θ� ������ �ִ� hello �޼��� ȣ��
		child.hello();
		System.out.println(child.getName());
		System.out.println(child1.getName());
		System.out.println(child.name);
		System.out.println(child1.name);
		
	}

}
