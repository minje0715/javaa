package day0504;

public class ParentClass {

	public String name;
	public String address;

	ParentClass() {
		System.out.println("�θ�⺻������");
	}

	ParentClass(String name, String address) {
		System.out.println("�θ� �Ű����� ������");
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ParentClass [name=" + name + ", address=" + address + "]";
	}
	
	public void hello() {
		System.out.println("�θ� hello �޼���");
	}
	
	
}