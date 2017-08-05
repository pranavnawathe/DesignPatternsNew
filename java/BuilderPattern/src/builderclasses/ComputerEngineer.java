package builderclasses;

public class ComputerEngineer {
	private ComputerBuilder cb;
	public ComputerEngineer(){
		cb = new ComputerBuilder();
	}
	
	public Computer makeComputer(){ 
		
		Computer c=cb.getComputer();    
		return c;
	}
	
	public ComputerBuilder getComputerBuilder(){
		return cb;
	}
 
}
