package banking;

import java.util.Random;

public class BankAccount {

		
		private double checkingBalance;
		private double savingsBalance;
		private static int NUM_OF_ACCOUNTS;
		private static int TOTAL_DEPOSITS;
		private static int ACCT_NUMBER;

		BankAccount(){
			NUM_OF_ACCOUNTS++;
			
		}
		
		public void deposit(double amount, String acctType){
			if (acctType == "checking") {
				this.checkingBalance += amount;
			} else {
				this.savingsBalance =+ amount;
			}
			TOTAL_DEPOSITS += amount;
			
		}
		
		public void withdraw(double amount, String acctType) {
			if(acctType == "checking" && checkingBalance >= amount) {
				this.checkingBalance -= amount;
			}	else if(savingsBalance >= amount) {
				savingsBalance -= amount;
			}
			
		}

		public double getCheckingBalance() {
			return checkingBalance;
		}

		public double getSavingsBalance() {
			return savingsBalance;
		}
		
		public void checkBalances() {
			System.out.println(checkingBalance + savingsBalance);
		}
		
		private int randomAcctNumber() {
			Random acctNum = new Random();
			for(int i = 0; i < 11; i++) {
				int n = acctNum.nextInt(10) + 0;
			}
			
			
			
			System.out.println(Math.abs(acctNum.nextInt()));
			return acctNum.nextInt();
			
		}
		
		public int provideNumber() {
			return randomAcctNumber();
		}

}
