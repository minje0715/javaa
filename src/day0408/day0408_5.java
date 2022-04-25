package day0408;

public class day0408_5 {

	public static void main(String[] args) {
		/* while문을 이용하여 1부터 10까지의 합계 출력
		 * 일단 합계만 출력해보고 1 + 2 + ~~~ `10 = 55도 출력해보세요
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
