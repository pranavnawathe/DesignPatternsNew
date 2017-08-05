

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


class Computer < ComputerPlan

  def addRAMArray
    @ram_array = Array.new
  end

  def addHDDArray
    @hdd_array = Array.new
  end

  def addMonitor
    @nonitor_list = Array.new
    @monitor_list << m
  end

  def addRAM
    begin
      @ram_array << r
    rescue Exception => e
      puts 'No RAM array installed'
    end
  end

  def addHardDisk
    begin
      @hdd_array << h
    rescue Exception => e
      puts 'No Hard Disk array installed'
    end
  end

  def addMouse
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

  def getTotalRAMCapcity
    capacity = 0
    if (@ram_array != nil)
      @ram_array.each {|r| capacity += r.getRAMCapacity}
    end
    capcity
  end

  def getHDDCapcity
    capacity = 0
    if (@hdd_array != nil)
      @hdd_array.each {|h| capacity += h.getHardDiskCapcity}
    end
    capcity
  end

end
  end