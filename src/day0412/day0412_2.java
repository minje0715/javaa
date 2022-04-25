package day0412;

import java.util.Scanner;

public class day0412_2 {

	public static void main(String[] args) {
		// 500 100 50 10
		// 680
		Scanner scan = new Scanner(System.in);
		int coins[] = {500, 100, 50, 10};
		int money = 0; // °Å½º¸§µ·
		int pay = 0;   // µ¿Àü °¹¼ö
		
		System.out.print("°Å½º¸§µ· : ");
		money = scan.nextInt();
		
		for(int i = 0; i < coins.length; i++) {
			pay = money/coins[i];
			money = money%coins[i];
			
			System.out.println(coins[i] + "¿ø µ¿Àü°¹¼ö´Â " + pay + "°³");
		}
	}
}
