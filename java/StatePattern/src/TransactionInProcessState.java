
public class TransactionInProcessState implements AtmMachineState{
	
	@Override
	public void insertCard() {
		System.out.println("Please wait for current transaction to complete before you can insert a new card");
		
	}

	@Override
	public void ejectDebitCard() {
		
		System.out.println("Please wait for current transactiom to complete before you can eject the card");
	}

	@Override
	public void withdraw() {
		System.out.println("Processing Transaction");
		
	}

}
