package factory;

public class USPostCode implements PostCode{
    String postalCode;
    
	public USPostCode(String postalCode)
    {
    	if(!isValidPostalCode(postalCode)) { //> 5
    		throw new IllegalArgumentException("Invalid postcode");
    	}
    	
    	this.postalCode = postalCode;
    }
	
	@Override
	public boolean isValidPostalCode(String postalCode) { //> 6
		return postalCode.matches("^[0-9]{5}(?:-[0-9]{4})?$");
	}

}
