package hust.soict.globalict.test.disc;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class TestPassingParameter {
	public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tempDigitalVideoDisc=dvd1;
		dvd1=dvd2;
		dvd2=tempDigitalVideoDisc;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd ,String title) {
		String oldTitle=dvd.getTitle();
		dvd.setTitle(title);
		dvd=new DigitalVideoDisc(oldTitle);
	}
	public static void swap1(Media media1,Media media2) {
		Media temp = null;
		switch(media1.getType()){
		case 1:
			temp=new DigitalVideoDisc((DigitalVideoDisc)media1);
			break;
		case 2:
			temp=new Book((Book) media1);
			break;
		}
		switch(media2.getType()) {
		case 1: 
			media1=new DigitalVideoDisc((DigitalVideoDisc) media2);
			break;
		case 2:
			media1=new Book((Book) media2);
		}
		switch(temp.getType()){
		case 1:
			media2=new DigitalVideoDisc((DigitalVideoDisc) temp);
			break;
		case 2:
			media2=new Book((Book)temp);
			break;
		}
		
	}
	public static void main(String[] agr) {
		DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
		swap1(jungleDVD,cinderellaDVD);
		System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
		System.out.println("Cinderella DVD title: "+cinderellaDVD.getTitle());
//		changeTitle(jungleDVD,cinderellaDVD.getTitle());
//		System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
	}
}

