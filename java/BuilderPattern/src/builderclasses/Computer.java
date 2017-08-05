package builderclasses;
import java.util.*;
public class Computer implements ComputerPlan {
    private ArrayList<Monitor> monitor_list = new ArrayList<Monitor>();  
    private ArrayList<RAM> ram_array;    
    private ArrayList<HardDisk> hdd_array ;
    private Mouse mouse;
	
	@Override
	public void addMonitor(Monitor m){
		monitor_list.add(m);
	}
	
	@Override
	public void addRAM(RAM r){
		try{
			ram_array.add(r);
		}
		catch(NullPointerException e){
			System.out.println("No RAM array installed");
		}
	}
	
	@Override
	public void addHardDisk(HardDisk h){
		try{
		hdd_array.add(h);}
		catch(NullPointerException e){
			System.out.println("No HDD Array installed");
		}
	}
	@Override
	public void addMouse(Mouse m){
		mouse = m;
	}
	
	public void addRAMArray(){
		ram_array = new ArrayList<RAM>();
	}
	public void addHDDArray(){
		hdd_array = new ArrayList<HardDisk>();
	}
	
	public ArrayList<Monitor> getMonitor(){
		return monitor_list;
	}
	
	public ArrayList<RAM> getRAM(){
		return ram_array; 
	}
	public ArrayList<HardDisk> getHDD(){
		return hdd_array;
	}
	public int getTotalRAMCapacity(){
		int capacity = 0;
		if(ram_array!=null){
		Iterator<RAM> it = ram_array.iterator();
		while(it.hasNext()){
			RAM r = it.next();
			capacity += r.getRAMCapacity();
		}
	}
		
		return capacity;
	}
	public int getHDDCapacity(){
		int capacity = 0;
		if(hdd_array!=null){
			Iterator<HardDisk> it = hdd_array.iterator();
			while(it.hasNext()){
				HardDisk h = it.next();
				capacity += h.getHardDiskCapacity();
			}
		}
		return capacity;
		
	}
	public Mouse getMouse(){
		return mouse;
	}

}
