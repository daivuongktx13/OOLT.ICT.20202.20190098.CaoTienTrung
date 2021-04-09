package hust.soict.globalict.test.disc;
import java.util.ArrayList;
import java.util.Arrays;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.utils.MediaUtils;

public class DVDTest {
	public static void main(String[] agrs) {
	DigitalVideoDisc dvd1=new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
	DigitalVideoDisc dvd3=new DigitalVideoDisc("BBBB", "bbbb", "bbbb", 2, 5.3f);
	DigitalVideoDisc dvd2=new DigitalVideoDisc("CCCC", "cccc", "cccc", 3, 5f);
	DigitalVideoDisc dvd5=new DigitalVideoDisc("DDDD", "dddd", "dddd", 4, 7.1f);
	DigitalVideoDisc dvd4=new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 3.3f);
	
	
	int temp1=MediaUtils.compareMediasByCost(dvd1, dvd2);
	if(temp1==1) System.out.println("DVD "+dvd1.getTitle()+" have higher cost than DVD "+dvd1.getTitle());
	if(temp1==-1) System.out.println("DVD "+dvd2.getTitle()+" have higher cost than DVD "+dvd2.getTitle());
	if(temp1==0) System.out.println("DVD "+dvd1.getTitle()+" have the same cost as DVD "+dvd1.getTitle());
	System.out.println(MediaUtils.compareMediasByTitle(dvd5, dvd3));
	//Sort by cost
	Media[] media1= {dvd1,dvd2,dvd3,dvd4,dvd5};
	ArrayList<Media> media1_list=new ArrayList<Media>(Arrays.asList(media1));
	ArrayList<Media> sorted= MediaUtils.sortMediasByCost(media1_list);
	System.out.println("Sort by cost");
	for(int i=0;i<sorted.size();i++) {
		System.out.println(i+1+"."+sorted.get(i).getDetail());
	}
	//Sort by title
	sorted= MediaUtils.sortMediasByTitle(media1_list);
	System.out.println("Sort by title");
	for(int i=0;i<sorted.size();i++) {
		System.out.println(i+1+"."+sorted.get(i).getDetail());
	}
	
	}
	
}

