package builderclasses;
import java.util.*;
public class SellComputer {
	
	public static void main(String[] args){
		ComputerEngineer ce = new ComputerEngineer();
		
		Computer c = ce.makeComputer();
		ComputerBuilder cb = ce.getComputerBuilder();
		cb.addHDDArray().addRAMArray().addHardDisk(1000).addRAM(256).addMonitor(17).addHardDisk(256).addHardDisk(784).addHardDisk(512).addMouse("Optical");
		System.out.println("Computer Assembled and ready");
		
		ArrayList<Monitor> m = c.getMonitor();
		
		System.out.println("List of Monitors:");
		ListIterator<Monitor> im = m.listIterator();
		while(im.hasNext()){
			System.out.println("Monitor "+(im.nextIndex()+1)+": "+im.next().getSize()+" inches");
		}
		
		ArrayList<RAM> r = c.getRAM();
		
		
		if(r!=null){
			System.out.println("List of RAMs: ");
			ListIterator<RAM> ir = r.listIterator();
			while(ir.hasNext()){
				System.out.println("RAM "+(ir.nextIndex()+1)+": "+ir.next().getRAMCapacity()+" MB");
		}
		System.out.println("Total RAM Capacity ="+c.getTotalRAMCapacity()+" MB");}
		
		
		ArrayList<HardDisk> h = c.getHDD();
		if(h!=null){
			ListIterator<HardDisk> ih = h.listIterator();
			System.out.println("List of HDDs");
			while(ih.hasNext()){
				System.out.println("HDD "+(ih.nextIndex()+1)+": "+ih.next().getHardDiskCapacity()+" GB");
		}
		System.out.println("Total HDD Capacity ="+c.getHDDCapacity()+" GB");}
	   
		if(c.getMouse()!=null)
		System.out.println("Computer Mouse Type= "+c.getMouse().getMouseType());
		
	}
	

}
