package day0408;

public class day0408_4 {

	public static void main(String[] args) {
		// i가 75이라는 값을 가질 때 반복문 종료
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