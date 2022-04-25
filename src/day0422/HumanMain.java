package day0422;

public class HumanMain {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);

		// Human 클래스에 대한 객체(인스턴스) 생성
		Human human1 = new Human();
		// [클래스이름][객체이름(내맘대로)] = new [클래스 생성자]

		// human1 객체에 정보를 담아봅시다.
		System.out.println(human1.name);
		human1.name = "홍길동";
		System.out.println(human1.name);

		Human human2 = new Human();
		System.out.println(human2.name);

		Human human3 = new Human("ㅇㅅㅇ");

		Human human4 = new Human(7);

		String var1 = "ㅎㅎㅎ";
		Human human5 = new Human(var1);

		Human human6 = new Human("김민제", 25, "인천", "남자");
		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.local);
		System.out.println(human6.gender);
	}

}
