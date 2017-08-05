package memento;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	
	 private List<Memento> homeTheatreList = new ArrayList<Memento>();

	 public void addMemento (Memento m) {
		 homeTheatreList.add(m);
	 }

	 public Memento getMemento (int index) {
		 return homeTheatreList.get(index);
	 }
}
