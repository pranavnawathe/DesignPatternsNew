class Tree
  def initialize(hasFlowers,hasFruits, height)
    @hasFlowers = hasFlowers;
    @hasFruits = hasFruits;
    @height = height;
  end

  def hasFlowers?
    @hasFlowers
  end

  def setHasFlowers(hasFlowers)
    @hasFlowers = hasFlowers;
  end
  def hasFruits?
    @hasFruits;
  end
  def setHasFruits(hasFruits)
    this.hasFruits = hasFruits
  end
  def getHeight
    @height
  end
  def setHeight(height)
    @height = height
  end
end


class OakTree < Tree

  def initialize
    super(false,false,70)
    @forestType="Deciduous"
  end
  def getRootDepth
    @rootDepth;
  end

  def setRootDepth(rootDepth)
    @rootDepth = rootDepth
  end


  def getForestType
    @forestType
  end

  def setForestType(forestType)
    @forestType = forestType
  end
end

class FloweringCherry < Tree
  def initialize
    super(true,false,20);
    @flowerColor = "Pink"
  end

  def getFlowerColor
    @flowerColor
  end

  def setFlowerColor(flowerColor)
    @flowerColor = flowerColor
  end
end

class TreeSelector
  @@treeBySpec= Hash.new
  def self.getTree(treeType)
    if @@treeBySpec.key? treeType
      return @@treeBySpec.fetch treeType
    else
      if treeType.eql? "Oak Tree"
        tree = OakTree.new
        @@treeBySpec[treeType] = tree
      elsif treeType.eql? "Flowering Cherry"
        tree = FloweringCherry.new
        @@treeBySpec[treeType] = tree
      else
        puts "#{treeType} not found"
      end
      return tree
    end
  end
end

myTreeList= Array.new

5.times{
  myTree =TreeSelector.getTree "Oak Tree"
  myTree.setRootDepth(7);
  myTreeList.push myTree
}

5.times{
  myTree =TreeSelector.getTree "Flowering Cherry"
  myTreeList.push myTree
}

myTreeList.each do |t|
  if t.instance_of? OakTree
    puts "Height= #{t.getHeight} Has Flowers= #{t.hasFlowers?} Has Fruits= #{t.hasFruits?} Root Depth= #{t.getRootDepth} Forest Type= #{t.getForestType}"
  else
    puts "Height= #{t.getHeight} Has Flowers= #{t.hasFlowers?} Has Fruits= #{t.hasFruits?} Flower Color= #{t.getFlowerColor}"
  end
end

myTreeList.each do |t|
  if t.instance_of? OakTree
    t.setForestType "Evergreen"
  else
    t.setFlowerColor "Violet"
  end
end

myTreeList.each do |t|
  if t.instance_of? OakTree
    puts "Height= #{t.getHeight} Has Flowers= #{t.hasFlowers?} Has Fruits= #{t.hasFruits?} Root Depth= #{t.getRootDepth} Forest Type= #{t.getForestType}"
  else
    puts "Height= #{t.getHeight} Has Flowers= #{t.hasFlowers?} Has Fruits= #{t.hasFruits?} Flower Color= #{t.getFlowerColor}"
  end
end