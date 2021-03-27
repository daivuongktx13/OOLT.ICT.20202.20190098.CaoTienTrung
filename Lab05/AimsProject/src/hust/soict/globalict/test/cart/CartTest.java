package hust.soict.globalict.test.cart;
import hust.soict.globalict.aims.order.Order;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
public class CartTest {
	public static void main(String[] agrs) {
		DigitalVideoDisc dvd1=new DigitalVideoDisc("AAAA", "aaaa", "aaaa", 1, 5.6f);
		DigitalVideoDisc dvd2=new DigitalVideoDisc("BBBB", "bbbb", "bbbb", 2, 5.3f);
		DigitalVideoDisc dvd3=new DigitalVideoDisc("CCCC", "cccc", "cccc", 3, 5f);
		DigitalVideoDisc dvd4=new DigitalVideoDisc("DDDD", "dddd", "dddd", 4, 7.1f);
		DigitalVideoDisc dvd5=new DigitalVideoDisc("EEEE", "eeee", "eeee", 5, 3.3f);
		//Make an order(Cart)
		Order anOrder= new Order();
		anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3,dvd4,dvd5);
		//Test sort cart by cost
		System.out.println("\nSorted cart by cost in descending order");
		anOrder.printSortedDVDsbyCost();
		//Test sort cart by title
		System.out.println("\nSorted cart by title");
		anOrder.printSortedDVDsbyTitle();
		//Test search for DVD
		System.out.println();
		anOrder.searchDVDsByID(4);
		//Test print cart
		System.out.println("\nSorted cart by default");
		anOrder.printDefaultSortedDVDs();
	}
}
