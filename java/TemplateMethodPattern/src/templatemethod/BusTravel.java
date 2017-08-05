package templatemethod;

import java.util.Scanner;

public class BusTravel extends Travel {
	Scanner sc = new Scanner(System.in);
	String destination;
	String startDate, endDate;
	boolean bookTicket;
	@Override
	void identifyDestination() {
		System.out.println("Enter your travel destination:");
		this.destination = sc.nextLine();
	}

	@Override
	void identifyTravelDates() {
		System.out.println("Enter start date:");
		this.startDate = sc.nextLine();
		System.out.println("Enter end date:");
		this.endDate = sc.nextLine();
	}

	@Override
	void chooseMeal() {}
	
	@Override
	void usePrivateVehicle() {}

	@Override
	void bookTicket() {
		System.out.println("Do you want to book a bus for "+destination+" beginning on "+startDate+" and ending on "+ endDate+"?(Enter Yes/No)");
		if (sc.nextLine().equalsIgnoreCase("Yes")){
			bookTicket = true;
		}
		else{
			bookTicket = false;
		}		
	}

	@Override
	void displayTravelDetails() {
		if (bookTicket == true){
			System.out.println("Your Bus travel has been confirmed. Details follow:");
			System.out.println("Destination = "+destination);
			System.out.println("Start Date = "+startDate);
			System.out.println("End Date = "+endDate);
			
		}
		else{
			System.out.println("Transaction cancelled");
		}
			
	}
	boolean isMealAvailable(){
		return false;
	}

}
