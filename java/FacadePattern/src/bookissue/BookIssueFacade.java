package bookissue;

public class BookIssueFacade {
	
	private int studentId;
	StudentAccountCheck acctCheck;
	BookAvailablityCheck bookCheck;
	
	
	public BookIssueFacade(int studentId) {
		this.studentId = studentId;	
		acctCheck = new StudentAccountCheck();
		bookCheck = new BookAvailablityCheck();
	}
	public int getStudentId() {
		return studentId;
	}
	
	public void issueBook(String book){
		if(acctCheck.isStudentIdValid(getStudentId()) && bookCheck.isBookAvailable(book)){
			System.out.println("You have 2 days to return it");
		}
	}

	

}
