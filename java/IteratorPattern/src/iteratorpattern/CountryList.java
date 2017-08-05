package iteratorpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CountryList implements CountryIterable {
	private ArrayList<Country> countryList = new ArrayList<Country>();
	
	public CountryList(){
		countryList.add(new Country("Russia",660,143));
		countryList.add(new Country("Japan",14,127));
		countryList.add(new Country("England",5,53));
	}
	
	@Override
	public Iterator getIterator(){
		return countryList.iterator();
	}

}
