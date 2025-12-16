package net.konic.corejava.Encapsulation;
/*
Q6. AtmWithdrawLimit
Question:
Create an ATM class with private balance.
Allow withdraw only if amount ≤ balance.
Input:
Balance: 5000
Withdraw: 6000
Output:
Insufficient balance
*/

public class AtmWithdrawLimit {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {

		this.balance = balance;
	}
	
	public void Withdraw(int amount) {
		if(amount<=balance) {
		balance = balance - amount;
		System.out.println("Withdrawal successful");
		System.out.println("Remaining balance: " + balance);
		
	}else {
		System.out.println("Insufficient Balance");
	}
	}

	public static void main(String[] args) {
		AtmWithdrawLimit obj = new AtmWithdrawLimit();
		obj.setBalance(5000);
		obj.Withdraw(5000);
		
	}
}
