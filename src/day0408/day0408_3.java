package day0408;

public class day0408_3 {

	public static void main(String[] args) {
		// 1부터 3까지 출력하기 (while문)
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		int j = 1;
		while (j <= 3) {
			System.out.println(j);
			j++;
		}

		// do while은 반복조건을 만족하지 않아도 반복코드 블록을 한번은 실행함
		int k = 1;
		do {
			System.out.println("do while 내부");
			System.out.println(k);
			k++;
		} while (k <= 5);
		System.out.println("do while 끝");
	}

}
