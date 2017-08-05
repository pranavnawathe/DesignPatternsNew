package memento;

public class HomeTheatre {
	
	private LedTV ledTv;
	private Speaker speaker;
	private static int stateCount = 0;
	
	public HomeTheatre(LedTV ledTv, Speaker speaker) {
		this.ledTv = ledTv;
		this.speaker = speaker;
		stateCount++;
	}

	public LedTV getLedTv() {
		return ledTv;
	}

	public void setLedTv(LedTV ledTv) {
		this.ledTv = ledTv;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public Memento createMemento() {
		return new Memento(ledTv,speaker); //This could be left as a blank
	} 
	
	public void setMemento(Memento memento)
	 {
		ledTv = memento.getLedTv();            //The method definition could be left as a blank
		speaker = memento.getSpeaker();
	 }
	
	public static int getStateCount(){
		return stateCount;
	}
	
	@Override
    public String toString() {
     return "HomeTheatre [ledTV = " + ledTv + "Speaker = "+speaker+"]";
    }
}
