
class Speaker

  def initialaize(wattage,isPortable)
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

  def toString
    "Speaker [Wattage= #{@wattage} wattage Is Portable= #{@isPortable} ]";
  end

end

