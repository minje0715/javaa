package day0502;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {
	static List<ClientDTO> clientList = new ArrayList<>();
	static List<BankingDTO> bankingList = new ArrayList<>();
	Long bankingId = 0L;
	
	public boolean save(ClientDTO newHuman) {

		return clientList.add(newHuman);
	}

	public boolean login(String accountNumber) {
		boolean logincheck = false;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				logincheck = true;
			}
		}
		return logincheck;
	}

	public int money(String accountNumber) {
		int monkey = 0;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				monkey = clientList.get(i).getBalance();

			}
		}
		return monkey;
	}

	public String createdTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		String clientCreatedDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy³âMM¿ùddÀÏ HH:mm:ss"));
		return clientCreatedDate;
	}

	public boolean plusMoney(String accountNumber, int deposit) {
		boolean plus = false;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit);
				BankingDTO banking = new BankingDTO(++bankingId, accountNumber, deposit, 0, createdTime());
				bankingList.add(banking);
				plus = true;
			}
		}
		return plus;
	}

	public boolean loseMoney(String accountNumber, String clientPass, int withdraw) {
		boolean lose = false;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())
					&& clientPass.equals(clientList.get(i).getClientPass())) {
				clientList.get(i).setBalance(clientList.get(i).getBalance() - withdraw);
				BankingDTO banking = new BankingDTO(++bankingId, accountNumber, withdraw, 0 , createdTime());
				bankingList.add(banking);
				lose = true;

			}
		}
		return lose;
	}

	public boolean pwCheck(String accountNumber, String clientPass) {
		boolean check = false;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())
					&& clientPass.equals(clientList.get(i).getClientPass())) {
				check = true;
			}
		}
		return check;
	}

//	public void bankingAll() {
//		for (int i = 0; i < bankingList.size(); i++) {
//			bankingList.get();
//		}
//	}
//
//	public void depositAll() {
//		for (int i = 0; i < bankingList.size(); i++) {
//
//		}
//	}
//
//	public void withdrawAll() {
//		for (int i = 0; i < bankingList.size(); i++) {
//
//		}
//	}

}