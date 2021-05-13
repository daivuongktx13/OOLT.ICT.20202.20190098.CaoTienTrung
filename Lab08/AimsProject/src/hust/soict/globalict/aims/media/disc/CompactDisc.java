package hust.soict.globalict.aims.media.disc;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.utils.Playable;

public class CompactDisc extends Disc implements Playable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String artist;
	private ArrayList<Track> tracks=new ArrayList<Track>();
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public String getArtist() {
		return artist;
	}
	public CompactDisc(String title,String category,float cost,int length,String director,String artist) {
		// TODO Auto-generated constructor stub
		super(title, category, cost, length, director);
		this.artist=artist;
		this.type=3;
	}
	public void addTrack(String title,int length) {
		Track track=new Track(title, length);
		if(tracks.contains(track)) {
			System.out.println("Track exist!");
			return;
		}
		tracks.add(track);
//		System.out.println("Add track complete!");
	}
	public void addTrack() {
		Scanner keyboard=new Scanner(System.in);
		String title=keyboard.next();
		int length=keyboard.nextInt();
		Track track=new Track(title,length);
		if(tracks.contains(track)) {
			System.out.println("Track exist!");
			keyboard.close();
			return;
		}
		tracks.add(track);
	//	System.out.println("Add track complete!");
		keyboard.close();
	}
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track exist!");
			return;
		}
		tracks.add(track);
	//	System.out.println("Add track complete!");
	}
	public void removeTrack() {
		Scanner keyboard=new Scanner(System.in);
		String title=keyboard.next();
		int length=keyboard.nextInt();
		Track track=new Track(title,length);
		try {
			tracks.remove(track);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		keyboard.close();
	}
	public int getLength() {
		int i;
		int length=0;
		for(i=0;i<tracks.size();i++) {
			length+=tracks.get(i).getLength();
		}
		return length;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		int i;
		System.out.println("CD by artist: "+getArtist());
		System.out.println("CD has "+tracks.size()+" tracks");
		for(i=0;i<tracks.size();i++) {
			tracks.get(i).play();
		}
	}
	@Override
	public String getDetail() {
		return "CD - "+id+" - "+title+" - "+category+" - "+director+" - "+length+" : "+artist+ " : "+cost+"$";
	}
	
	

}
