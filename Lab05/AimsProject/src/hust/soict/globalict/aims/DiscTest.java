package hust.soict.globalict.aims;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;

public class DiscTest {
	public static void main(String[] agrs) {
		Order anOrder=new Order();
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars","Sciene Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvd4=new DigitalVideoDisc("Harry Potter", "Adventure", 20.42f);
		
		//DigitalVideoDisc dvd[]= {dvd1,dvd2,dvd3};
		anOrder.addDigitalVideoDisc(dvd3,dvd2,dvd1,dvd4);
		System.out.println("Result for search word \"King Lion\" in DVD1: "+dvd1.search("King Lion"));
		System.out.println("Result for search word \"King Liom\" in DVD1: "+dvd1.search("King Liom"));
		System.out.println("Result for search word \"King\" in DVD1: "+dvd1.search("King"));
		
		DigitalVideoDisc luckyDigitalVideoDisc=anOrder.getALuckyItem();
		anOrder.getDetail(luckyDigitalVideoDisc);
	}
}
