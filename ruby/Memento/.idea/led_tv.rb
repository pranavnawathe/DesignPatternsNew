class LedTV

  def initialize(ledTv,speaker)
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

  def createMemento
    Memento.new @ledTv, @speaker
  end

  def self.getStateCount
    @@statecount
  end

  def toString
    "Home Theatre [Led TV =#{@ledTv} Speaker = #{@speaker}"
  end
end