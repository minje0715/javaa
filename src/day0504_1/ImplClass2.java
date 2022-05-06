package day0504_1;

public class ImplClass2 implements TestInterface{

	@Override
	public void hello() {
		System.out.println("ImplClass2.hello()");
		
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImplClass2.hello2()" + name);
		
	}

}
