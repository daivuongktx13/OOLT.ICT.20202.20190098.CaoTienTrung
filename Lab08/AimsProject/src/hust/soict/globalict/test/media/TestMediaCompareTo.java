package hust.soict.globalict.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class TestMediaCompareTo {
	public static void main(String[] agrs) {
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars","Sciene Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvd4=new DigitalVideoDisc("Harry Potter", "Adventure", 20.42f);
		Collection<Media> collection=new ArrayList<Media>();
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		collection.add(dvd4);
		Iterator<Media> iterator=collection.iterator();
		System.out.println("-----------------------------");
		System.out.println("The DVDs currently in the order are: ");
		while(iterator.hasNext()) {
			System.out.println( ((DigitalVideoDisc)iterator.next()).getTitle() );
		}
		Collections.sort((List<Media>)collection);
		iterator=collection.iterator();
		System.out.println("-----------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while(iterator.hasNext()) {
			System.out.println( ((DigitalVideoDisc)iterator.next()).getTitle() );
		}
		System.out.println("-----------------------------");
		
	}
	
}
