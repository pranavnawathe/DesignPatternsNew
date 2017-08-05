package memento;

public class Speaker {
	private int wattage;
	private boolean isPortable;
	public Speaker(int wattage, boolean isPortable) {
		super();
		this.wattage = wattage;
		this.isPortable = isPortable;
	}
	public int getWattage() {
		return wattage;
	}
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	public boolean isPortable() {
		return isPortable;
	}
	public void setPortable(boolean isPortable) {
		this.isPortable = isPortable;
	}
	
	@Override
	 public String toString() {
	 return "Speaker [Wattage=" + wattage + ", Is Portable=" + isPortable +"]";
	 }

}
