package day0504;

public class ChildClass extends ParentClass {
	
	ChildClass(){
		System.out.println("�ڽ� �⺻������");
	}
	
	ChildClass(String name, String address){
		System.out.println("�ڽ� �Ű����� ������");
		this.name = name;
		this.address = address;
	}

	// �޼��� �������̵�(������)
	//
	@Override
	public void hello() {
		System.out.println("�ڽ� hello �޼���");
	}
	
}
