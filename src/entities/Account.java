package entities;

import Exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance = 0.0;

	public Account() {
	}

	public Account(Integer number, String holder, Double initialDesposit) throws DomainException {
		this.number = number;
		this.holder = holder;
		deposit(initialDesposit);
	}

	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
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

	public void deposit(double amount) throws DomainException {
		if (amount <= 0) {
			throw new DomainException("Value entered is invalid, You must enter values ​​above $ 0.00");
		}
		balance += amount;
	}

	public void withdraw(double amount) throws DomainException {
		if (balance < (amount + 5.0)) {
			throw new DomainException(String.format(
					"Insufficient amount in the account to carry out this operation\nAvailable Value: $ %.2f",
					(amount - 5.0)));
		}
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + String.format(", Balance : $ %.2f", balance);
	}

}
