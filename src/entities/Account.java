package entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;

	

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
		balance = 0.0 ;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
	    balance -= amount + 5.0;
	}
	
}
