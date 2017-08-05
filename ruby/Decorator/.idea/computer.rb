class Computer
  def getParts
    raise NotImplementedError.new("Implement this method in a subclass")
  end

  def getCost
    raise NotImplementedError.new("Implement this method in a subclass")
  end
end

class BasicComputer < Computer
  def initialize
    @ram = 256
    @rom = 4
  end

  def getParts
    "RAM =#{@ram} MB ROM = #{@rom} GB"
  end

  def getCost
    200
  end
end

class HardwareCustomizer < Computer
  def initialize(newComp)
    __________________ 
  end

  def getParts
    @tempComp.getParts
  end

  def getCost
    @tempComp.getCost
  end
end

class GamingComputer < HardwareCustomizer
  def initialize(newComp)
    super newComp
    @graphics = 2
    @graphicsCost = 10
  end

  def getParts
    "#{@tempComp.getParts} Graphics Card = #{@graphics} GB"
  end

  def getCost
    @tempComp.getCost + @graphicsCost
  end
end

class Laptop < HardwareCustomizer
  def initialize(newComp)
    super newComp
    @ssd = 200
    @ssdCost = 80
  end

  def getParts
    "#{@tempComp.getParts} Solid State Drive = #{@ssd} GB"
  end

  def getCost
    @tempComp.getCost + @ssdCost
  end
end

customizedPC = GamingComputer.new(Laptop.new(BasicComputer.new))
puts "Parts: #{customizedPC.getParts}"
puts "Cost = #{customizedPC.getCost}"
