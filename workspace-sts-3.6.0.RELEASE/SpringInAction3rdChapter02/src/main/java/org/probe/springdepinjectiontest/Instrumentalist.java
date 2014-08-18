package org.probe.springdepinjectiontest;

public class Instrumentalist implements Performer {
	public Instrumentalist() {
		
	}
	
	public void perform() {
		// TODO Auto-generated method stub
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}
	
	private String song;
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public String getSong() {
		return song;
	}
	
	public String screamSong() {
		return song;
	}
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
