package Encapsulation;

//Data hiding - to  each and every data member private 
// To access the data member we will have getter and setter method

public class DataHiding {
	//You are not allowing your data member to be access directly outside the class
		private int balance=500;
		private int deposit;
		private int LoanEligibility;
		
		//To access private data member we will have public method,based on validation
		//you will allow outside world to see private data member
		public int getbalance(int AccountNumber) {
			if(AccountNumber==123) {
				return this.balance;
			} else {
				return 0;
			}
			
		}
		
		//for each data member we will have one get method and one set method
		//like for deposit we have getdeposit and setdeposit(int a)
		public int getdeposit() {
			return this.deposit;
		}
		
		public int LoanEligility() {
			return LoanEligibility; //if you don't add this compiler will add 
		}
		
		public void setBalance(int balance) {
			this.balance=balance;
		}
		
		public void SetDeposit(int deposit) {
			this.deposit=deposit;
		}


}
