package day0408;

public class day0408_3 {

	public static void main(String[] args) {
		// 1���� 3���� ����ϱ� (while��)
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		int j = 1;
		while (j <= 3) {
			System.out.println(j);
			j++;
		}

		// do while�� �ݺ������� �������� �ʾƵ� �ݺ��ڵ� ����� �ѹ��� ������
		int k = 1;
		do {
			System.out.println("do while ����");
			System.out.println(k);
			k++;
		} while (k <= 5);
		System.out.println("do while ��");
	}

}
