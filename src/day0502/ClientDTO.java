package day0502;

import java.util.Objects;

public class ClientDTO {
	
	private Long clientId;//°í°´¹øÈ£
	private String clientName;//°í°´ÀÌ¸§
	private String clientPass; //°í°´ºñ¹Ð¹øÈ£
	private String accountNumber; //°èÁÂ¹øÈ£
	private int balance; //ÀÜ¾×
	private String clientCreatedDate;//°¡ÀÔ³¯Â¥
	
	ClientDTO(){
		
	}

	public ClientDTO(Long clientId, String clientName, String clientPass, String accountNumber, int balance,
			String clientCreatedDate) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientPass = clientPass;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.clientCreatedDate = clientCreatedDate;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientPass() {
		return clientPass;
	}

	public void setClientPass(String clientPass) {
		this.clientPass = clientPass;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getClientCreatedDate() {
		return clientCreatedDate;
	}

	public void setClientCreatedDate(String clientCreatedDate) {
		this.clientCreatedDate = clientCreatedDate;
	}

	@Override
	public String toString() {
		return "ClientDTO [clientId=" + clientId + ", clientName=" + clientName + ", clientPass=" + clientPass
				+ ", accountNumber=" + accountNumber + ", balance=" + balance + ", clientCreatedDate="
				+ clientCreatedDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, balance, clientCreatedDate, clientId, clientName, clientPass);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientDTO other = (ClientDTO) obj;
		return Objects.equals(accountNumber, other.accountNumber) && balance == other.balance
				&& Objects.equals(clientCreatedDate, other.clientCreatedDate)
				&& Objects.equals(clientId, other.clientId) && Objects.equals(clientName, other.clientName)
				&& Objects.equals(clientPass, other.clientPass);
	}
	
	
	
}