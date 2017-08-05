package iteratorpattern;

import java.util.Iterator;

public class CountryDetails {
	public static void main(String[] args){
		Iterator it;
		System.out.println("Country Set");
		it = new CountrySet().getIterator(); //getIterator could be left as a blank
		displayCountries(it);
		System.out.println("Country Array");
		it = new CountryArray().getIterator();
		displayCountries(it);
		System.out.println("Country List");
		it = new CountryList().getIterator();
		displayCountries(it);
		
	}
	public static void displayCountries(Iterator it){
		while (it.hasNext()){
			Country c= (Country)it.next();
			System.out.println("Country Name = "+c.getName()+" Country Area = "+c.getArea()+" Country Population = "+c.getPopulation() );
		}
	}

}
