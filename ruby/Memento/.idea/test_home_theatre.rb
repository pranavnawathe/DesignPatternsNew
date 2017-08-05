class LedTV

  def initialize(ledTv,speaker,usbSupport)
    @ledTv = ledTv
    @speaker = speaker
    @usbSupport = usbSupport
  end

  def getLedTv
    @ledTv
  end

  def setLedTv(ledTv)
    @ledTv = ledTv
  end

  def getSpeaker
    @speaker
  end

  def setSpeaker(speaker)
    @speaker = speaker
  end

  def self.getStateCount
    @@statecount
  end

  def to_str
    "Home Theatre [Led TV =#{@ledTv} Speaker = #{@speaker}"
  end
end


class Speaker

  def initialize(wattage,isPortable)
    @wattage = wattage;
    @isPortable = isPortable;
  end
  def getWattage
    @wattage
  end
  def setWattage(wattage)
    @wattage = wattage;
  end
  def isPortable
    @isPortable;
  end
  def setPortable(isPortable)
    @isPortable = isPortable;
  end

  def to_str
    "Speaker [Wattage= #{@wattage} wattage Is Portable= #{@isPortable} ]";
  end

end

class HomeTheatre
  @@stateCount = 0
  def initialize(ledTv, speaker)
    @ledTv = ledTv
    @speaker = speaker
    @@stateCount +=1
  end

  def getLedTv
    @ledTv
  end

  def setLedTv(ledTv)
    @ledTv = ledTv
  end

  def getSpeaker
    @speaker
  end

  def setSpeaker(speaker)
    @speaker = speaker
  end


  def createMemento
    Memento.new @ledTv, @speaker
  end

  def setMemento(memento)
    @ledTv = memento.getLedTv
    @speaker = memento.getSpeaker
  end

  def self.getStateCount
    @@stateCount
  end

  def to_str
    "HomeTheatre [ledTV = #{@ledTv} Speaker = #{@speaker}]"
  end
end

class Memento

  def initialize(ledTv, speaker)
    @ledTv = ledTv
    @speaker = speaker
  end

  def getLedTv
    @ledTv
  end

  def setLedTv(ledTv)
    @ledTv = ledTv
  end

  def getSpeaker
    @speaker
  end

  def setSpeaker(speaker)
    @speaker = speaker
  end

  def to_str
    "Memento [ledTV = #{@ledTv} Speaker = #{@speaker}]"
  end

end

class Warehouse
  def initialize
    @homeTheatreList = Array.new
  end
  def addMemento(m)
    @homeTheatreList.push m
  end
  def getMemento(i)
    @homeTheatreList.at(i)
  end
end


l1 = LedTV.new "32","200",true
l2 = LedTV.new "40","300",true

s1 = Speaker.new 1000,true
s2 = Speaker.new 2000,true

h = HomeTheatre.new l1,s1
w = Warehouse.new

h = HomeTheatre.new l1,s2
w.addMemento(h.createMemento)

h = HomeTheatre.new l2,s2
w.addMemento(h.createMemento)

puts "Current home Theatre State: #{h.to_str}"
puts "Enter which state you want to rollback to. Enter values between 1 and #{HomeTheatre.getStateCount}"
rollBackState = gets.to_i

if rollBackState<1 or rollBackState> HomeTheatre.getStateCount
  puts "State does not exist"
else
  h.setMemento(w.getMemento(rollBackState-1))
end
puts "Current Home Theatre State: #{h.to_str}"
