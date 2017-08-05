
class Balance
  @@firstInstance = nil

  def initialize (income)
    @income = income
  end

  def self.getInstance
    if (@@firstInstance == nil)
      @@firstInstance = Balance.new(10000)
    end
    @@firstInstance
  end

  def withdraw(amount)
    if (@income>amount)
      @income -= amount
    else
      puts "Insufficient Balance"
    end

  end

  def deposit(amount)
    @income += amount
  end

  def getBalance
    @income
  end
  private :initialize

end

class FamilyMember

  def initialize(name)
    @name = name
    @b = Balance.getInstance
  end

  def withdraw(val)
    @b.withdraw val
  end

  def deposit(val)
    @b.deposit val
  end

  def getBalance
    @b.getBalance
  end

end

father = FamilyMember.new "Father"
puts "Current family Balance = #{father.getBalance}"
puts "Father adds to Balance"
father.deposit 1000
puts "Total Income after deposit = #{father.getBalance}"

son = FamilyMember.new "Son"
puts "Son withdraws "
son.withdraw 200

puts "Balance after withdrawing =#{son.getBalance}"

