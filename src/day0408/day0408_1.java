package day0408;

public class day0408_1 {

	public static void main(String[] args) {
		/*
		 * 4x + 5y = 60
		 * x,y는 1보다 크거나 같고 10보다 작거나 같은 정수
		 * 5,8  10,4
		 */
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4*x) + (5*y) == 60) {
					System.out.println(x + "," + y);
				}
			}
		}
	} 
}