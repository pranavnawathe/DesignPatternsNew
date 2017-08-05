package flyweight;

public abstract class Tree {
	private boolean hasFlowers;
	private boolean hasFruits;
	private int height;
	public Tree(boolean hasFlowers, boolean hasFruits, int height) {
		super();
		this.hasFlowers = hasFlowers;
		this.hasFruits = hasFruits;
		this.height = height;
	}
	
	public boolean hasFlowers() {
		return hasFlowers;
	}
	public void setHasFlowers(boolean hasFlowers) {
		this.hasFlowers = hasFlowers;
	}
	public boolean hasFruits() {
		return hasFruits;
	}
	public void hasFruits(boolean hasFruits) {
		this.hasFruits = hasFruits;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
