package flyweight;

public class FloweringCherry extends Tree {
	private String flowerColor;

	public FloweringCherry() {
		super(true,false,20);
		// TODO Auto-generated constructor stub
		this.setFlowerColor("Pink");
	}

	public String getFlowerColor() {
		return flowerColor;
	}

	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
}
