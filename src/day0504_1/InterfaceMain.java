package day0504_1;

public class InterfaceMain {

	public static void main(String[] args) {
		//인터페이스 자체로는 객체생성 불가능; 인터페이스 타입의 변수선언은 가능
		// 인터페이스는 생성자를 가지지 않음.
//		TestInterface interface1 = new TestInterface();
		TestInterface impl1 = new ImplClass1();
		impl1.hello();
		impl1.hello2("바로핑");
		impl1 = new ImplClass2();		
		impl1.hello();
		impl1.hello2("맛나핑");
		
		
		// ImplClass1으로 개발을 하다가 ImplClass2로 바꿔야 하는 경우
		ImplClass1 implc1 = new ImplClass1();
		implc1.hello();
		implc1.hello2("차차핑");
		ImplClass2 implc2 = new ImplClass2();
		implc2.hello();
		implc2.hello2("해핑");
	}

}
