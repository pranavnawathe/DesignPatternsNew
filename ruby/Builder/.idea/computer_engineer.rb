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
end
