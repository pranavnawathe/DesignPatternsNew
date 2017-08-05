package singleton;

class Balance {
	private static Balance firstInstance = null; 
	private int balance;
	
	private Balance (int balance) {
		this.balance = balance;
	}
	
	public static Balance getInstance (){
		if (firstInstance == null) {	 
			firstInstance = new Balance(10000);
		}
		return firstInstance;
	}
	public void withdraw (int amount){
	  if (balance>amount)
		balance -= amount;
	  else
	        System.out.println("Insufficient balance");
	}
	public void deposit (int amount){
		balance += amount;
	}
	public int getBalance (){
		return balance;
	}
	

}
