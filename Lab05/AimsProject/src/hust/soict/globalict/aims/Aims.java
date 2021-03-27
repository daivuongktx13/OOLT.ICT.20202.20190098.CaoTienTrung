package hust.soict.globalict.aims;
import hust.soict.globalict.aims.order.Order;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
public class Aims {
	public static void main(String[] agrs) {
		Order anOrder=new Order();
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars","Sciene Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		//DigitalVideoDisc dvd[]= {dvd1,dvd2,dvd3};
		anOrder.addDigitalVideoDisc(dvd3,dvd2,dvd1);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
	//	anOrder.removeDigitalVideoDisc(dvd2);
	//	anOrder.removeDigitalVideoDisc(dvd3);
	//	anOrder.removeDigitalVideoDisc(dvd1);
	//	System.out.println("Total cost is: ");
	//	System.out.println(anOrder.totalCost());
	}
}
