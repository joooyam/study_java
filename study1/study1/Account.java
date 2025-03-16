package study1;

public class Account {

	int balance = 1_000_000;

	public boolean isSufficient() {
		return balance >= 10_000;
	}

	public class AccountWithConstructor{
		int balance;
		
		public AccountWithConstructor(int balance) {
			this.balance=balance;
		}
	}
	public static void main(String[] args) {

		Account acoountA = new Account();
		Account acoountB = new Account();

		System.out.println("A계좌에 잔액이 충분한지? \n" + acoountA.isSufficient());
		System.out.println("B계좌에 잔액이 충분한지? \n" + acoountB.isSufficient());
	}
}
