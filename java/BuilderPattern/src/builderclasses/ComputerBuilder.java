package builderclasses;

public class ComputerBuilder implements PCBuilder {
	private Computer computer;
	public ComputerBuilder(){
		computer = new Computer();
	}

	@Override
	public ComputerBuilder addMonitor(int size) {
		Monitor m= new Monitor(size);
		computer.addMonitor(m);
		return this;
	}

	
	@Override
	public ComputerBuilder addMouse(String type) {
		Mouse m = new Mouse(type);
		computer.addMouse(m);
		return this;
	}
	@Override
	public ComputerBuilder addRAM(int size){
		RAM r = new RAM(size);
		computer.addRAM(r);
		return this;
		
	}
	@Override
	public ComputerBuilder addHardDisk(int size){
		HardDisk h = new HardDisk(size);
		computer.addHardDisk(h);
		return this;
	}
	
	
	public ComputerBuilder addRAMArray(){
		computer.addRAMArray();
		return this;
	}
	
	public ComputerBuilder addHDDArray(){
		computer.addHDDArray();
		return this;
	}
		
	public Computer getComputer(){
		return computer;
	}
}
