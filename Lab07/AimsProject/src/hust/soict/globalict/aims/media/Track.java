package hust.soict.globalict.aims.media;

import java.io.Serializable;

import hust.soict.globalict.aims.utils.Playable;

public class Track implements Playable,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	private String title;
	private int length;
	
	public Track(String title,int length) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.length=length;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("DVD Track: " + this.getLength());
	}

}
