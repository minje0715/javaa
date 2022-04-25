package day0408;

import java.util.Iterator;

public class day0408_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber = 0;
		int try1 = 0;
		boolean run = true;
		while (run) {
			randomNumber = (int) (Math.random() * 6) + 1;
			if (randomNumber != 6) {
				System.out.println(randomNumber);

			} else {
				System.out.println(randomNumber);
				run = false;
			}
			try1++;
		}
		System.out.println("6이 나왔네요. 종료합니다.");
		System.out.println("시도횟수는" + try1 + "회입니다.");
	}

}
