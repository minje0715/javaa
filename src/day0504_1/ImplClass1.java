package day0504_1;

// TestInterface�� ����Ŭ������ ����
// �������̽��� ����Ŭ������ ����� ���� ����
public class ImplClass1 implements TestInterface{

	@Override
	public void hello() {
	System.out.println("ImplClass1.hello()");
		
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImplClass1.hello2()" + name);
		
	}
	
	
}
