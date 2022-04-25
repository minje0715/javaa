package day0422;

public class Test {
	String name = "";
	String major = "";
	String studentNumber = "";
	int age = 0;
	
	
	Test(){
		
	}
	
	Test(String name, int age){
		this.name = name;
		this.age = age;
		this.major = "Àü°ø1";
		this.studentNumber = "2022";
		System.out.println(major);
		System.out.println(studentNumber);
	}
	
	Test(String name, String major, String studentNumber, int age) {
//		this.name = name;
//		this.major = major;
//		this.studentNumber = studentNumber;
//		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	
}