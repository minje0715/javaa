package day0408;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// 1.예금 2.출금 3.잔고 4.종료

		Scanner scan = new Scanner(System.in);

		int money = 0;
		int bank = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택 >");
			money = scan.nextInt();
			
			if(money == 1) {
				System.out.println("예금액>");
				money = scan.nextInt();
				bank += money;
				System.out.println("현재잔액은 " + bank + "원 입니다");
			}else if(money == 2) {
				System.out.println("출금액>");
				money = scan.nextInt();
				
				if(money > bank) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("현재 잔액은 " + bank + "원 입니다");
				}else {
					bank -= money;
					System.out.println("현재잔액은 " + bank + "원 입니다");
				}
			}else if(money == 3) {
				System.out.println("현재잔액은 " + bank + "원 입니다");
			}else if(money == 4) {
				System.out.println("종료");
				run = false;
			}else {
				System.out.println("1~4번 중에서 고르세요");
			}
		}
	}

}
