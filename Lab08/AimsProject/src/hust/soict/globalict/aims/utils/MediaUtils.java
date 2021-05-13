package hust.soict.globalict.aims.utils;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.test.disc.TestPassingParameter;

public class MediaUtils{
	public static int compareTitle(String str1,String str2) {
		int i=0;
		int length1=str1.length();
		int length2=str2.length();
		while((i<length1) && (i<length2)) {
			if(str1.charAt(i)>str2.charAt(i)) return 1;
			else if(str1.charAt(i)<str2.charAt(i)) return -1;
			i++;
		}
		if(length1>length2) return 1;
		if(length1<length2) return -1;
		return 0;
	}
	public static int compareMediasByCost(Media media1,Media media2) {
		if(media1.getCost()>media2.getCost()) return 1;
		else if(media1.getCost()<media2.getCost()) return -1;
		else return 0;
		}
	public static int compareMediasByTitle(Media media1,Media media2) {
		char firstCharOfTitle1=media1.getTitle().charAt(0);
		char firstCharOfTitle2=media2.getTitle().charAt(0);
		if(firstCharOfTitle1>firstCharOfTitle2) return 1;
		else if(firstCharOfTitle1<firstCharOfTitle2) return -1;
		else return 0;
	}
//	public static int compareMediasByLength(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
//		if(dvd1.getLength()>dvd2.getLength()) return 1;
//		else if(dvd1.getCost()<dvd2.getCost()) return -1;
//		else return 0;
//	}
	public static ArrayList<Media> sortMediasByCost(ArrayList<Media> medias) {
		int i,j;
		for(i=0;i<medias.size()-1;i++) {
			for(j=i+1;j<medias.size();j++) {
				if(compareMediasByCost(medias.get(i),medias.get(j))==-1) {
					TestPassingParameter.swap1(medias.get(i),medias.get(j) );
				} 
			}
		}
		return medias;
	}
//	public static DigitalVideoDisc[] sortDVDsByCost(DigitalVideoDisc[] dvds,int arraylength) {
//		int i,j;
//		for(i=0;i<arraylength-1;i++) {
//			for(j=i+1;j<arraylength;j++) {
//				if(compare(dvds[i], dvds[j])==-1) {
//					TestPassingParameter.swap1(dvds[i], dvds[j]);
//				} 
//			}
//		}
//		return dvds;
//	}
	public static ArrayList<Media> sortMediasByTitle(ArrayList<Media > medias) {
		int i,j;
		for(i=0;i<medias.size()-1;i++) {
			for(j=i+1;j<medias.size();j++) {
				if(compareMediasByTitle(medias.get(i), medias.get(j))==1) {
					TestPassingParameter.swap1(medias.get(i), medias.get(j));
				} 
			}
		}
		return medias;
	}
//	public static DigitalVideoDisc[] sortDVDsByTitle(DigitalVideoDisc[] dvds,int arraylength) {
//		int i,j;
//		for(i=0;i<arraylength-1;i++) {
//			for(j=i+1;j<arraylength;j++) {
//				if(compareDVDsByTitle(dvds[i], dvds[j])==1) {
//					TestPassingParameter.swap1(dvds[i], dvds[j]);
//				} 
//			}
//		}
//		return dvds;
//	}
}
