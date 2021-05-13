package hust.soict.globalict.aims.media.factory;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.disc.DigitalVideoDisc;

public class DVDFactory extends MediaFactory{

	@Override
	public Media createMedia() {
		// TODO Auto-generated method stub
		System.out.print("Enter title of DVD: ");
		String title=sc.next();
		System.out.print("Enter category of DVD: ");
		String category=sc.next();
		System.out.print("Enter director of DVD: ");
		String director=sc.next();
		System.out.print("Enter length of DVD: ");
		int length=sc.nextInt();
		System.out.println("Enter cost of DVD: ");
		float cost=sc.nextFloat();
		DigitalVideoDisc dvd=new DigitalVideoDisc(title, category, director, length, cost);
		return dvd;
	}

}
