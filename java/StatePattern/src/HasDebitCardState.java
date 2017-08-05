
public class HasDebitCardState implements AtmMachineState
{


  @Override
  public void insertCard()
  {
    System.out.println("Debit Card is already there,So you cannot insert the Debit Card ...");

  }

  @Override
  public void ejectDebitCard()
  {
    System.out.println("Debit Card is ejected...");
  }

  @Override
  public void withdraw()
  {
    System.out.println("Pin number has been entered correctly and money has been withdrawn...");

  }
}
