package day0422;

public class HumanMain {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);

		// Human Ŭ������ ���� ��ü(�ν��Ͻ�) ����
		Human human1 = new Human();
		// [Ŭ�����̸�][��ü�̸�(�������)] = new [Ŭ���� ������]

		// human1 ��ü�� ������ ��ƺ��ô�.
		System.out.println(human1.name);
		human1.name = "ȫ�浿";
		System.out.println(human1.name);

		Human human2 = new Human();
		System.out.println(human2.name);

		Human human3 = new Human("������");

		Human human4 = new Human(7);

		String var1 = "������";
		Human human5 = new Human(var1);

		Human human6 = new Human("�����", 25, "��õ", "����");
		System.out.println(human6.name);
		System.out.println(human6.age);
		System.out.println(human6.local);
		System.out.println(human6.gender);
	}

}
