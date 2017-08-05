class AtmMachineState
  def insertCard
    raise NotImplementedError, "Override this method in a subclass"
  end
  def ejectDebitCard
    raise NotImplementedError, "Override this method in a subcalss"
  end
  def withdraw
    raise NotImplementedError, "Override this method in a subcalss"
  end
end

class HasDebitCardState < AtmMachineState
  def insertCard
    puts "Debit Card is already there,So you cannot insert the Debit Card ..."
  end
  def ejectDebitCard
    puts "Debit Card is ejected..."
  end
  def withdraw
    puts "Pin number has been entered correctly and money has been withdrawn..."
  end
end

class NoDebitCardState < AtmMachineState
  def insertCard
    puts "Card inserted ...."
  end
  def ejectDebitCard
    puts "No Debit Card in ATM Machine slot, so you cannot eject the Debit Card..."
  end
  def withdraw
    puts "No Debit Card in ATM Machine slot, so you cannot enter the pin and withdraw the money..."
  end
end

class AtmMachine < AtmMachineState
  def initialize
    @atmMachineState =NoDebitCardState.new
  end
  def getAtmMachineState
    @atmMachineState;
  end
  def setAtmMachineState(atmMachineState)
    @atmMachineState = atmMachineState;
  end
  def insertCard
    @atmMachineState.insertCard
    if @atmMachineState.instance_of? NoDebitCardState
      hasDebitCardState = HasDebitCardState.new;
      setAtmMachineState hasDebitCardState
      puts "Now in ATM Machine internal state : #{@atmMachineState.class.to_s}"
    end
  end
  def ejectDebitCard
    @atmMachineState.ejectDebitCard
    if @atmMachineState.instance_of? HasDebitCardState
      noDebitCardState = NoDebitCardState.new;
      setAtmMachineState noDebitCardState
      puts "Now in ATM Machine internal state : #{@atmMachineState.class.to_s}"
    end
  end
  def withdraw
    @atmMachineState.withdraw
  end
end

atmMachine = AtmMachine.new;

puts "ATM Machine Current state : #{atmMachine.getAtmMachineState.class.to_s}"

puts
atmMachine.withdraw
atmMachine.ejectDebitCard
atmMachine.insertCard

puts "ATM Machine Current state : #{atmMachine.getAtmMachineState.class.to_s}"
puts

atmMachine.withdraw
atmMachine.insertCard
atmMachine.ejectDebitCard

puts "ATM Machine Current state : #{atmMachine.getAtmMachineState.class.to_s}"