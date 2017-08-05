
public class AtmMachine implements AtmMachineState
{

  private AtmMachineState atmMachineState;

  public AtmMachine()
  {
    atmMachineState = new NoDebitCardState();
  }

  public AtmMachineState getAtmMachineState()
  {
    return atmMachineState;
  }

  public void setAtmMachineState( AtmMachineState atmMachineState )
  {
    this.atmMachineState = atmMachineState;
  }

  @Override
  public void insertCard()
  {
    atmMachineState.insertCard();

    if( atmMachineState instanceof NoDebitCardState )
    {

      AtmMachineState hasDebitCardState = new HasDebitCardState();
      setAtmMachineState(hasDebitCardState);
      System.out.println("Now in ATM Machine internal state : "
                      + atmMachineState.getClass().getName());
    }

  }

  @Override
  public void ejectDebitCard()
  {
    atmMachineState.ejectDebitCard();

    if( atmMachineState instanceof HasDebitCardState )
    {

      AtmMachineState noDebitCardState = new NoDebitCardState();
      setAtmMachineState(noDebitCardState);
      System.out.println("Now in ATM Machine internal state : "
                      + atmMachineState.getClass().getName());
    }

  }

  @Override
  public void withdraw() 
  {
    atmMachineState.withdraw();    
  }

}