package memento;

public class Memento {
	private LedTV ledTv;
	private Speaker speaker;
	
	public Memento(LedTV ledTv, Speaker speaker) {
		this.ledTv = ledTv;
		this.speaker = speaker;
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
	
	@Override
    public String toString() {
     return "Memento [ledTV = " + ledTv + "Speaker = "+speaker+"]";
    }
}
