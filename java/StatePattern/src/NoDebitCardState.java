
public class NoDebitCardState implements AtmMachineState
{

  @Override
  public void insertCard()
  {
    System.out.println("Card inserted ....");

  }

  @Override
  public void ejectDebitCard()
  {

    System.out.println("No Debit Card in ATM Machine slot, so you cannot eject the Debit Card...");
  }

  @Override
  public void withdraw()
  {
    System.out.println("No Debit Card in ATM Machine slot, so you cannot enter the pin and withdraw the money...");

  }

}
