package bookissue;


import java.util.HashMap;
import java.util.Map;

public class BookAvailablityCheck {
	private static Map<String,Integer> bookMap ;
	static{
		bookMap = new HashMap<String,Integer>();
		bookMap.put("Java- The Complete Reference", 1);
		bookMap.put("Design of Wood Structures", 3);
		bookMap.put("Three Mistakes of My Life", 7);
	}
	
	public boolean isBookAvailable(String book){
		if(bookMap.containsKey(book)&& bookMap.get(book)>0){
			bookMap.put(book, bookMap.get(book)-1);
			System.out.println("The Book is available");
			return true;
		}
		else{
			System.out.println("I am sorry the book is not available");
			return false;
		}
	}

}
