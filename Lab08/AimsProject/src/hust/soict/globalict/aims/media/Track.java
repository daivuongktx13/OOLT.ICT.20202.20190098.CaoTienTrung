package hust.soict.globalict.aims.media;

import java.io.Serializable;

import hust.soict.globalict.aims.utils.MediaUtils;
import hust.soict.globalict.aims.utils.Playable;

public class Track implements Playable,Serializable,Comparable<Object> {
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
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Track) {
			Track track=(Track) obj;
			return (this.title==track.title) && (this.length==track.length);
		}
		return false;
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Track) {
			Track track=(Track) o;
			int result=MediaUtils.compareTitle(this.title,track.title);
			if(result==1) return 1;
			if(result==-1) return -1;
			if(this.length>track.length) return 1;
			else if(this.length<track.length) return -1;
			return 0;
		}
		return 0;
	}

}
