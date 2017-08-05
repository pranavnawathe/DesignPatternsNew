=begin
require 'computer'
require 'computer_builder'
require 'computer_engineer'
require 'computer_plan'
require 'hard_disk'
require 'monitor'
require 'mouse'
require 'pc_builder'
require 'ram'
=end


module BuilderPattern
class ComputerBuilder < PCBuilder

  def initialize
    @computer = Computer.new
  end

  def addMonitor
    m = Monitor.new
    m.setSize size
    @computer.addMonitor m
    self
  end

  def addMouse
    m = Mouse.new
    m.setMouseType type
    @computer.addMouse m
    self
  end

  def addRam
    r = RAM.new
    r.setRAMCapacity size
    @computer.addRam r
    self
  end

  def addHardDisk
    h  = HardDisk.new
    h.setHardDiskCapcity size
    @computer.addHardDisk h
    self
  end

  def addRAMArray
    @computer.addRAMArray size
    self
  end

  def addHDDArray
    @computer.addHDDArray size
    self
  end

  def getComputer
    @computer
  end



end
end
