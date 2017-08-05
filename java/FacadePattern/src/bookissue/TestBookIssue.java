package bookissue;

public class TestBookIssue {
	public static void main(String[] args){
		BookIssueFacade b1 = new BookIssueFacade(2001);
		b1.issueBook("Java- The Complete Reference");
		
		BookIssueFacade b2 = new BookIssueFacade(2001);
		b2.issueBook("Java- The Complete Reference");
		
	}

}
