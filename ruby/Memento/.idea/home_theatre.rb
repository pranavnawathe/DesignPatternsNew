

class HomeTheatre

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


  def self.getStateCount()
   @@stateCount
  end

  def toString
   "HomeTheatre [ledTV = #{@ledTv} Speaker = #{@speaker}]"
  end
end



