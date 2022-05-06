package day0504_1;

// TestInterface의 구현클래스로 선언
// 인터페이스를 구현클래스로 만들기 위한 문법
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
