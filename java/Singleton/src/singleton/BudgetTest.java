package singleton;

public class BudgetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FamilyMember father = new FamilyMember("Father");
		System.out.println("Current family balance="+father.getBalance());
		System.out.println("Father deposits money");
		father.deposit(1000);
		System.out.println("Balance after deposit ="+father.getBalance());
		
		FamilyMember son = new FamilyMember("Son");
		System.out.println("Son withdraws money");
		son.withdraw(200);
		
		System.out.println("Balance after withdrawal ="+son.getBalance());
	}

}
