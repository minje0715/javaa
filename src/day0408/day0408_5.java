package day0408;

public class day0408_5 {

	public static void main(String[] args) {
		/* while���� �̿��Ͽ� 1���� 10������ �հ� ���
		 * �ϴ� �հ踸 ����غ��� 1 + 2 + ~~~ `10 = 55�� ����غ�����
		 */
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			System.out.print(num);
			sum += num;
			if(num < 10) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			num++;
			}
		System.out.print(sum);
	}
}
