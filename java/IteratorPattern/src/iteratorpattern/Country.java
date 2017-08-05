package iteratorpattern;

public class Country {
	private String name;
	private int area;
	private int population;
	public Country(String name, int area, int population) {
		super();
		this.name = name;
		this.area = area;
		this.population = population;
	}
	public String getName() {
		return name;
	}

	public int getArea() {
		return area;
	}

	public int getPopulation() {
		return population;
	}


	
}
