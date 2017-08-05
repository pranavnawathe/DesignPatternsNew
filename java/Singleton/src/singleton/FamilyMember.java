package singleton;

class FamilyMember {
	Balance b; 
	String name;
    public FamilyMember (String name) {
    	this.name = name;
    	b = Balance.getInstance(); 
    }
    
    public void withdraw (int val) {
    	b.withdraw(val); 
    }
    public void deposit (int val) { 
    	b.deposit(val); 
    }
    public int getBalance() { 
    	return b.getBalance(); 
    }
}
