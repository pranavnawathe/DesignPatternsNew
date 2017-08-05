package templatemethod;

import java.util.Scanner;

public class RoadTrip extends Travel{
	Scanner sc = new Scanner(System.in);
	String destination;
	String startDate, endDate;
	boolean bookTicket;
	boolean hasOwnVehicle;
	boolean hasRentedVehicle;
	String vehicleName;
	@Override
	void identifyDestination() {
		System.out.println("Enter your Travel destination:");
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
	void usePrivateVehicle() {
		System.out.println("Are you going to take your own vehicle?");
		if(sc.nextLine().equalsIgnoreCase("Yes")){
			hasOwnVehicle = true;
			System.out.println("Enter Your Vehicle Name:");
			this.vehicleName = sc.nextLine();
		}
		else{
			
			System.out.println("Do you want to rent a vehicle?");
			if(sc.nextLine().equalsIgnoreCase("Yes")){
				hasRentedVehicle = true;
				System.out.println("Enter name of vehicle to be rented:");
				this.vehicleName = sc.nextLine();
			}
		}
	}

	@Override
	void bookTicket() {}

	@Override
	void displayTravelDetails() {
		if(this.hasOwnVehicle || this.hasRentedVehicle){
			System.out.println("Your Road Trip has been confirmed. Details follow:");
			System.out.println("Destination = "+destination);
			System.out.println("Start Date = "+startDate);
			System.out.println("End Date = "+endDate);
			System.out.println("Vehicle name = "+vehicleName);
			
		}
		else{
			System.out.println("No vehicle available for Road Trip");
		}
			
	}
	boolean isMealAvailable(){
		return false;
	}
	boolean usePublicTransport(){
		return false;
	}

}
