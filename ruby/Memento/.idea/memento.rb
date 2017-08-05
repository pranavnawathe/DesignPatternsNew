

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

  def toString
    "Memento [ledTV = #{@ledTv} Speaker = #{@speaker}]"
  end

end