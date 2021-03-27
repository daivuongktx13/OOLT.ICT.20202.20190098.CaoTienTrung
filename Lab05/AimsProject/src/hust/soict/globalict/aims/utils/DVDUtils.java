package hust.soict.globalict.aims.utils;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.test.disc.TestPassingParameter;

public class DVDUtils {
	public static int compareDVDsByCost(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(dvd1.getCost()>dvd2.getCost()) return 1;
		else if(dvd1.getCost()<dvd2.getCost()) return -1;
		else return 0;
		}
	public static int compareDVDsByTitle(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		char firstCharOfTitle1=dvd1.getTitle().charAt(0);
		char firstCharOfTitle2=dvd2.getTitle().charAt(0);
		if(firstCharOfTitle1>firstCharOfTitle2) return 1;
		else if(firstCharOfTitle1<firstCharOfTitle2) return -1;
		else return 0;
	}
	public static int compareDVDsByLength(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(dvd1.getLength()>dvd2.getLength()) return 1;
		else if(dvd1.getCost()<dvd2.getCost()) return -1;
		else return 0;
	}
	public static DigitalVideoDisc[] sortDVDsByCost(DigitalVideoDisc... dvds) {
		int i,j;
		for(i=0;i<dvds.length-1;i++) {
			for(j=i+1;j<dvds.length;j++) {
				if(compareDVDsByCost(dvds[i], dvds[j])==-1) {
					TestPassingParameter.swap1(dvds[i], dvds[j]);
				} 
			}
		}
		return dvds;
	}
	public static DigitalVideoDisc[] sortDVDsByCost(DigitalVideoDisc[] dvds,int arraylength) {
		int i,j;
		for(i=0;i<arraylength-1;i++) {
			for(j=i+1;j<arraylength;j++) {
				if(compareDVDsByCost(dvds[i], dvds[j])==-1) {
					TestPassingParameter.swap1(dvds[i], dvds[j]);
				} 
			}
		}
		return dvds;
	}
	public static DigitalVideoDisc[] sortDVDsByTitle(DigitalVideoDisc...dvds) {
		int i,j;
		for(i=0;i<dvds.length-1;i++) {
			for(j=i+1;j<dvds.length;j++) {
				if(compareDVDsByTitle(dvds[i], dvds[j])==1) {
					TestPassingParameter.swap1(dvds[i], dvds[j]);
				} 
			}
		}
		return dvds;
	}
	public static DigitalVideoDisc[] sortDVDsByTitle(DigitalVideoDisc[] dvds,int arraylength) {
		int i,j;
		for(i=0;i<arraylength-1;i++) {
			for(j=i+1;j<arraylength;j++) {
				if(compareDVDsByTitle(dvds[i], dvds[j])==1) {
					TestPassingParameter.swap1(dvds[i], dvds[j]);
				} 
			}
		}
		return dvds;
	}
}
