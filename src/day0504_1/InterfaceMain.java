package day0504_1;

public class InterfaceMain {

	public static void main(String[] args) {
		//�������̽� ��ü�δ� ��ü���� �Ұ���; �������̽� Ÿ���� ���������� ����
		// �������̽��� �����ڸ� ������ ����.
//		TestInterface interface1 = new TestInterface();
		TestInterface impl1 = new ImplClass1();
		impl1.hello();
		impl1.hello2("�ٷ���");
		impl1 = new ImplClass2();		
		impl1.hello();
		impl1.hello2("������");
		
		
		// ImplClass1���� ������ �ϴٰ� ImplClass2�� �ٲ�� �ϴ� ���
		ImplClass1 implc1 = new ImplClass1();
		implc1.hello();
		implc1.hello2("������");
		ImplClass2 implc2 = new ImplClass2();
		implc2.hello();
		implc2.hello2("����");
	}

}
