package iteratorpattern;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountrySet implements CountryIterable{
	Set<Country> countrySet = new HashSet<Country>();
	public CountrySet(){
		countrySet.add(new Country("India",120,1252));
		countrySet.add(new Country("United States",380,316));
		countrySet.add(new Country("China",370,1357));
	}
	
	@Override
	public Iterator getIterator(){
		return countrySet.iterator();
	}
}
