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
		System.out.print("���̸�: ");
		String clientName = scan.next();
		System.out.print("��й�ȣ: ");
		String clientPass = scan.next();
		System.out.print("���¹�ȣ: ");
		String accountNumber = scan.next();
		boolean loginResult = br.login(accountNumber);

		if (!loginResult) {
			LocalDateTime dateTime = LocalDateTime.now();
			String clientCreatedDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss"));

			ClientDTO newHuman = new ClientDTO(++id, clientName, clientPass, accountNumber, 0, clientCreatedDate);
			boolean saveResult = br.save(newHuman);

			if (saveResult) {
				System.out.println("�ű԰� ��� �Ϸ�!");
			}
		} else {
			System.out.println("�ߺ��� ���¹�ȣ�Դϴ�");
		}
	}

	public void howMuch() {
		System.out.print("���¹�ȣ: ");
		String accountNumber = scan.next();
		boolean loginResult = br.login(accountNumber);
		if (loginResult) {
			int balance = br.money(accountNumber);
			System.out.println("�ܾ��� " + balance + " �� �Դϴ�");

		} else {
			System.out.println("���� ���¹�ȣ�Դϴ�.");
		}

	}

	public void plusMoney() {
		System.out.print("�Ա��� ���¹�ȣ: ");
		String accountNumber = scan.next();
		System.out.print("�Ա��� �ݾ�: ");
		int deposit = scan.nextInt();
		boolean loginResult = br.plusMoney(accountNumber, deposit);
		if (loginResult) {
			System.out.println("�ԱݵǾ����ϴ�");
		} else {
			System.out.println("���°� ��ġ���� �ʽ��ϴ�.");
		}
	}

	public void losemoney() {
		System.out.print("����� ���¹�ȣ: ");
		String accountNumber = scan.next();
		System.out.print("��й�ȣ: ");
		String clientPass = scan.next();
		boolean passCheck = br.pwCheck(accountNumber, clientPass);
		if (!passCheck) {
			System.out.println("���¹�ȣ�� ��й�ȣ�� Ȯ�����ּ���");
		} else {
			System.out.print("����� �ݾ�: ");
			int withdraw = scan.nextInt();
			boolean logintResult = br.loseMoney(accountNumber, clientPass, withdraw);
			if (logintResult) {
				System.out.println("��ݵǾ����ϴ�");
			} else {
				System.out.println("�ܾ��� �����մϴ�");
			}

		}
	}

//	public void bankingList() {
//		List<BankingDTO> bankingList = new ArrayList<>();
//		boolean run = true;
//
//		System.out.print("���¹�ȣ �Է�: ");
//		String accountNumber = scan.next();
//		boolean loginResult = br.login(accountNumber);
//		if (loginResult) {
//			while (run) {
//				System.out.println("1. ���ŷ����� Ȯ��");
//				System.out.println("2. �Աݳ��� Ȯ��");
//				System.out.println("3. ��ݳ��� Ȯ��");
//				System.out.println("4. ����");
//				System.out.print("��ȣ ���� > ");
//				int select = scan.nextInt();
//				if (select == 1) {
//					br.bankingAll();
//				} else if (select == 2) {
//				br.depositAll();
//				} else if (select == 3) {
//					br.withdrawAll();
//				} else if (select == 4) {
//					System.out.println("�����մϴ�");
//					run = false;
//				}
//			}
//		} else {
//			System.out.println("���°� ��ġ���� �ʽ��ϴ�");
//		}

	}
//}