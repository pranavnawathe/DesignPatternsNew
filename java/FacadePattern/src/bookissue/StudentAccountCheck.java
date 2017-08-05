package bookissue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentAccountCheck {
	private List<Integer> studentIdList = new ArrayList<Integer>(Arrays.asList(2000,2001,2002,2003,2005,2010));
	public boolean isStudentIdValid (int sid) {
		if(studentIdList.contains(sid)){
			return true;
		}
		else{
			System.out.println("I am sorry, your ID is invalid");
			return false; 
		}
	}

}
