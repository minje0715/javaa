package day0502;

import java.util.Objects;

public class BankingDTO {
	
	private Long bankingId; // 거래내역 번호
	private String accountNumber; //계좌번호
	private int deposit = 0; //입금액
	private int withdraw = 0;//출금액
	private String bankingDate; //거래일자
	
	BankingDTO(){
		
	}

	public BankingDTO(Long bankingId, String accountNumber, int deposit, int withdraw, String bankingDate) {
		super();
		this.bankingId = bankingId;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.bankingDate = bankingDate;
	}

	public Long getBankingId() {
		return bankingId;
	}

	public void setBankingId(Long bankingId) {
		this.bankingId = bankingId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public String getBankingDate() {
		return bankingDate;
	}

	public void setBankingDate(String bankingDate) {
		this.bankingDate = bankingDate;
	}

	@Override
	public String toString() {
		return "BankingDTO [bankingId=" + bankingId + ", accountNumber=" + accountNumber + ", deposit=" + deposit
				+ ", withdraw=" + withdraw + ", bankingDate=" + bankingDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, bankingDate, bankingId, deposit, withdraw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankingDTO other = (BankingDTO) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(bankingDate, other.bankingDate)
				&& Objects.equals(bankingId, other.bankingId) && deposit == other.deposit && withdraw == other.withdraw;
	}

	
	
}
