package day0502;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {
	int balance = 0;

	static Long id = 0L;
	Scanner scan = new Scanner(System.in);
	BankRepository br = new BankRepository();

	public void save() {
		System.out.print("고객이름: ");
		String clientName = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		boolean loginResult = br.login(accountNumber);

		if (!loginResult) {
			LocalDateTime dateTime = LocalDateTime.now();
			String clientCreatedDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));

			ClientDTO newHuman = new ClientDTO(++id, clientName, clientPass, accountNumber, 0, clientCreatedDate);
			boolean saveResult = br.save(newHuman);

			if (saveResult) {
				System.out.println("신규고객 등록 완료!");
			}
		} else {
			System.out.println("중복된 계좌번호입니다");
		}
	}

	public void howMuch() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		boolean loginResult = br.login(accountNumber);
		if (loginResult) {
			int balance = br.money(accountNumber);
			System.out.println("잔액은 " + balance + " 원 입니다");

		} else {
			System.out.println("없는 계좌번호입니다.");
		}

	}

	public void plusMoney() {
		System.out.print("입금할 계좌번호: ");
		String accountNumber = scan.next();
		System.out.print("입금할 금액: ");
		int deposit = scan.nextInt();
		boolean loginResult = br.plusMoney(accountNumber, deposit);
		if (loginResult) {
			System.out.println("입금되었습니다");
		} else {
			System.out.println("계좌가 일치하지 않습니다.");
		}
	}

	public void losemoney() {
		System.out.print("출금할 계좌번호: ");
		String accountNumber = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();
		boolean passCheck = br.pwCheck(accountNumber, clientPass);
		if (!passCheck) {
			System.out.println("계좌번호와 비밀번호를 확인해주세요");
		} else {
			System.out.print("출금할 금액: ");
			int withdraw = scan.nextInt();
			boolean logintResult = br.loseMoney(accountNumber, clientPass, withdraw);
			if (logintResult) {
				System.out.println("출금되었습니다");
			} else {
				System.out.println("잔액이 부족합니다");
			}

		}
	}

//	public void bankingList() {
//		List<BankingDTO> bankingList = new ArrayList<>();
//		boolean run = true;
//
//		System.out.print("계좌번호 입력: ");
//		String accountNumber = scan.next();
//		boolean loginResult = br.login(accountNumber);
//		if (loginResult) {
//			while (run) {
//				System.out.println("1. 모든거래내역 확인");
//				System.out.println("2. 입금내역 확인");
//				System.out.println("3. 출금내역 확인");
//				System.out.println("4. 종료");
//				System.out.print("번호 선택 > ");
//				int select = scan.nextInt();
//				if (select == 1) {
//					br.bankingAll();
//				} else if (select == 2) {
//				br.depositAll();
//				} else if (select == 3) {
//					br.withdrawAll();
//				} else if (select == 4) {
//					System.out.println("종료합니다");
//					run = false;
//				}
//			}
//		} else {
//			System.out.println("계좌가 일치하지 않습니다");
//		}

	}
//}