
public class Client
{

  public static void main( String[] args )
  {
    AtmMachine atmMachine = new AtmMachine();

    System.out.println("ATM Machine Current state : "
                    + atmMachine.getAtmMachineState().getClass().getName());

    System.out.println();
    atmMachine.withdraw();
    atmMachine.ejectDebitCard();
    atmMachine.insertCard();
    
    System.out.println("\nATM Machine Current state : "
                    + atmMachine.getAtmMachineState().getClass().getName());
    System.out.println();

    atmMachine.withdraw();
    atmMachine.insertCard();
    atmMachine.ejectDebitCard();

    System.out.println("\nATM Machine Current state : "
                    + atmMachine.getAtmMachineState().getClass().getName());

  }

}

