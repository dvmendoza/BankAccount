package banking;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bs = new BankAccount();
		bs.deposit(1000, "checking");
		bs.checkBalances();
		bs.withdraw(500, "checking");
		bs.checkBalances();
		bs.provideNumber();
		
		

	}

}
