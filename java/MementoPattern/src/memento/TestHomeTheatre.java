package memento;

import java.util.Scanner;

public class TestHomeTheatre {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		LedTV l1 = new LedTV("32","200",true);
		LedTV l2 = new LedTV("40","300",true);
		
		Speaker s1 = new Speaker(1000,true);
		Speaker s2 = new Speaker(2000,true);
		
		HomeTheatre h = new HomeTheatre(l1,s1);
		
		Warehouse w = new Warehouse();
		w.addMemento(h.createMemento());
		
		h = new HomeTheatre(l1,s2);
		w.addMemento(h.createMemento());
		
		h = new HomeTheatre(l2,s2);
		w.addMemento(h.createMemento());
		
		
		
		System.out.println("Current Home theatre state : "+h);
		
		System.out.println("Enter which state you want to rollback to. Enter values between 1 and "+HomeTheatre.getStateCount());
		int rollBackState = sc.nextInt();
		sc.nextLine();
		
		if (rollBackState<1 || rollBackState>HomeTheatre.getStateCount()) {
			System.out.println("State does not exist");
		}
		else {
			h.setMemento(w.getMemento(rollBackState-1));
		}
			
		System.out.println("Current Home theatre state : "+h);
		
		
	}

}
