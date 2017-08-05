package templatemethod;

import java.util.Scanner;

public class AirTravel extends Travel {
	Scanner sc = new Scanner(System.in);
	String destination;
	String startDate, endDate;
	boolean bookTicket;
	String meal;
	boolean mealSelected;
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
	void chooseMeal() {
		System.out.println("Select your meal choice from the following:");
		System.out.println("1. Asian Vegetarian");
		System.out.println("2. Low Calorie Meal");
		System.out.println("3. Gluten Free Meal");
		System.out.println("4. Vegetarian Oriental Meal");
		System.out.println("Choose any other number if you dont want a meal");
		mealSelected = true;
		int mealChoice = sc.nextInt();
		sc.nextLine();
		switch(mealChoice){
			case 1: this.meal = "Asian Vegetarian";
					break;
			case 2: this.meal = "Low Calorie Meal";
					break;
			case 3: this.meal = "Gluten Free Meal";
					break;
			case 4: this.meal = "Vegetarian Oriental Meal";
					break;
			default: mealSelected = false;
					 break;
		}
		
	}
	@Override
	void usePrivateVehicle() {}

	@Override
	void bookTicket() {
		System.out.println("Do you want to book your flight for "+destination+" beginning on "+startDate+" and ending on "+ endDate+"?(Enter Yes/No)");
			if(sc.nextLine().equalsIgnoreCase("Yes")){
			bookTicket = true;
		}
		else{
			bookTicket = false;
		}		
	}

	@Override
	void displayTravelDetails() {
		if (bookTicket == true){
			System.out.println("Your flight has been confirmed. Details follow:");
			System.out.println("Destination = "+destination);
			System.out.println("Start Date = "+startDate);
			System.out.println("End Date = "+endDate);
			if (mealSelected == true){
				System.out.println("Meal selected = "+ meal);
			}
			
		}
		else{
			System.out.println("Transaction cancelled");
		}
			
	}



}
