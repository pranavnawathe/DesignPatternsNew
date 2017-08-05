module BuilderPattern
class ComputerPlan

  def addMonitor
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addHardDisk
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addRAM
    raise NotImplementedError, "Override this method in a subclass"
  end

  def addMouse
    raise NotImplementedError, "Override this method in a subclass"
  end
end
end
