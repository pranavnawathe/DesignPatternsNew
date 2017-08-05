package templatemethod;

public abstract class Travel {
	
	final void travel(){
		identifyDestination();
		identifyTravelDates();
		if (!usePublicTransport()){
			usePrivateVehicle();
		}
		if (isMealAvailable()){
			chooseMeal();
		}
		if (usePublicTransport()){
			bookTicket();
		}	
		displayTravelDetails();
	}
	
	

	

	abstract void identifyDestination();
	abstract void identifyTravelDates();
	abstract void chooseMeal();
	abstract void usePrivateVehicle();
	abstract void bookTicket();
	abstract void displayTravelDetails();
	
	boolean isMealAvailable(){return true;}
    boolean usePublicTransport() {return true;}
	

}
