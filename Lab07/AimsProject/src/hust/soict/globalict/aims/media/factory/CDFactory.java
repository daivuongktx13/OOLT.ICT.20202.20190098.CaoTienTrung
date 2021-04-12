package hust.soict.globalict.aims.media.factory;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.media.disc.CompactDisc;

public class CDFactory  extends MediaFactory{

	@Override
	public Media createMedia() {
		System.out.print("Enter title of DVD: ");
		String title=sc.next();
		System.out.print("Enter category of DVD: ");
		String category=sc.next();
		System.out.print("Enter director of DVD: ");
		String director=sc.next();
		System.out.print("Enter artist of DVD: ");
		String artist=sc.next();
		System.out.print("Enter length of DVD: ");
		int length=sc.nextInt();
		System.out.print("Enter cost of DVD: ");
		float cost=sc.nextFloat();
		CompactDisc cd=new CompactDisc(title, category, cost, length, director, artist);
		int choice;
		do {
			System.out.println("Input tracks: ");
			System.out.println("1.Input");
			System.out.println("2.Return");
			System.out.println("Your choice: ");
			choice=sc.nextInt();
			if(choice==1) {
				System.out.print("Input title of track: ");
				String titleForTrack=sc.next();
				System.out.print("Input length of track: ");
				int lengthForTrack=sc.nextInt();
				Track track=new Track(titleForTrack, lengthForTrack);
				cd.addTrack(track);
			}
		}while(choice!=2);
		return cd;
	}
	

}
