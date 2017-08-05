
class ComputerPlan

  def addMonitor(m)
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addHardDisk(h)
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addRAM(r)
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addMouse(m)
    raise NotImplementedError, "Override this method in a subclass"
  end
end

class PCBuilder

  def addMonitor(size)
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addHardDisk(size)
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addRAM(size)
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addMouse(str)
    raise NotImplementedError, "Override this method in a subclass"
  end

end

class RAM

  def setRAMCapacity(capacity)
    @capcity = capacity
  end

  def getRAMCapacity
    @capcity
  end

end

class HardDisk

  def setHardDiskCapacity(capacity)
    @capacity = capacity
  end
  def getHardDiskCapacity
    @capacity
  end
end

class Monitor

  def initialize
  end
  def setSize(monsize)
    @size = monsize
  end
  def getSize
    @size
  end
end

class Mouse

  def setMouseType type
    @mousetype = type
  end

  def getMouseType
    @mousetype
  end

end





class Computer < ComputerPlan

  def initialize
    @monitor_list = []
  end

  def addRAMArray
    @ram_array = []
  end

  def addHDDArray
    @hdd_array = []
  end

  def addMonitor(m)


    @monitor_list.push(m)
  end

  def addRAM(r)
    begin
      @ram_array << r
    rescue Exception => e
      puts 'No RAM array installed'
    end
  end

  def addHardDisk(h)
    begin
      @hdd_array << h
    rescue Exception => e
      puts 'No Hard Disk array installed'
    end
  end

  def addMouse(m)
    @mouse = m
  end

  def getMonitor
    @monitor_list
  end

  def getRAM
    @ram_array
  end

  def getHDD
    @hdd_array
  end

  def getMouse
    @mouse
  end

  def getTotalRAMCapacity
    capacity = 0
    if (@ram_array != nil)
      @ram_array.each {|r| capacity += r.getRAMCapacity}
    end
    capacity
  end

  def getHDDCapacity
    capacity = 0
    if (@hdd_array != nil)
      @hdd_array.each {|h| capacity += h.getHardDiskCapacity}
    end
    capacity
  end

end


class ComputerBuilder < PCBuilder

  def initialize
    @computer = Computer.new
  end

  def addMonitor(size)
    m = Monitor.new
    m.setSize size
    @computer.addMonitor(m)
    self
  end

  def addMouse(type)
    m = Mouse.new
    m.setMouseType type
    @computer.addMouse m
    self
  end

  def addRAM(size)
    r = RAM.new
    r.setRAMCapacity size
    @computer.addRAM r
    self
  end

  def addHardDisk(size)
    h  = HardDisk.new
    h.setHardDiskCapacity size
    @computer.addHardDisk h
    self
  end

  def addRAMArray
    @computer.addRAMArray
    self
  end

  def addHDDArray
    @computer.addHDDArray
    self
  end

  def getComputer
    @computer
  end



end

class ComputerEngineer

  def initialize
    @cb = ComputerBuilder.new
  end

  def makeComputer
    c = @cb.getComputer
    c
  end

  def getComputerBuilder
    @cb
  end

end





ce = ComputerEngineer.new
c = ce.makeComputer
cb = ce.getComputerBuilder
cb.addHDDArray.addRAMArray.addHardDisk(1000).addRAM(256).addMonitor(17).addMonitor(20).addHardDisk(256).addHardDisk(784).addHardDisk(512).addMouse("Optical")
puts 'Computer Assembled and Ready'

m = c.getMonitor
puts 'List of Monitors:'
m.each_with_index do |mon,index|
  puts "Monitor #{index+1}: #{mon.getSize} inches"
end


r = c.getRAM
if r != nil
  puts 'List of RAMs:'

  r.each_with_index do|ram,index|
    puts "RAM #{index+1}: #{ram.getRAMCapacity} MB"

  end
  puts "Total RAM Capcity = #{c.getTotalRAMCapacity} MB"
end

h = c.getHDD
if h!= nil
  puts 'List of HDDs:'

  h.each_with_index do|hdd,index|
    puts "HDD #{index+1}: #{hdd.getHardDiskCapacity} GB"

  end
  puts "Total HDD Capcity = #{c.getHDDCapacity} GB"
end

if c.getMouse != nil
  puts "Computer Mouse Type= #{c.getMouse.getMouseType} "
end
