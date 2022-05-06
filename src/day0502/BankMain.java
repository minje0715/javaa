package day0502;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BankService bs = new BankService();

		int selectNum = 0;
		boolean run = true;

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.신규 고객 등록 2.잔액조회 3.입금 4.출금 5.거래내역확인 6.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("번호 선택> ");
			selectNum = scan.nextInt();
			if (selectNum == 1) {
				bs.save();
			} else if (selectNum == 2) {
				bs.howMuch();
			} else if (selectNum == 3) {
				bs.plusMoney();
			} else if (selectNum == 4) {
				bs.losemoney();
			} else if (selectNum == 5) {
//				bs.bankingList();
			} else if (selectNum == 6) {
				System.out.println("프로그램을 종료합니다^^");
			}
		}
	}

}
