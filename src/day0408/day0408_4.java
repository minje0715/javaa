package day0408;

public class day0408_4 {

	public static void main(String[] args) {
		// i�� 75�̶�� ���� ���� �� �ݺ��� ����
		boolean run = true;
		int i = 0;
		while (run) {
			System.out.println(i);
			if (i == 75) {
				run = false;
			}
			i++;
		}
	}
}