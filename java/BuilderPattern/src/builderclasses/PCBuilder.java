package builderclasses;

public interface PCBuilder {
	
	public PCBuilder addMonitor(int size);
	public PCBuilder addHardDisk(int size);
	public PCBuilder addRAM(int size);
	public PCBuilder addMouse(String s);

}
