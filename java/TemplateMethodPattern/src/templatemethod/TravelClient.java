package templatemethod;

import java.util.Scanner;

public class TravelClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one of the following travel modes:");
		System.out.println("1. Bus Travel");
		System.out.println("2. Air Travel");
		System.out.println("3. Road Trip");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice){
			case 1: Travel busTravel = new BusTravel();
				    busTravel.travel();
				    break;
			case 2: Travel airTravel = new AirTravel();
			        airTravel.travel();
			        break;
			case 3: Travel roadTrip = new RoadTrip();
			        roadTrip.travel();
			default: System.out.println("Travel choice not available");
		
		}
		
		
		
        
		
	}

}
