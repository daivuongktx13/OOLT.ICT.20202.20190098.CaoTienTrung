package hust.soict.globalict.aims.order;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import java.lang.Math;
import hust.soict.globalict.aims.utils.DVDUtils;
import hust.soict.globalict.test.disc.TestPassingParameter;
public class Order {
	public static final int MAX_NUMBERS_ORDERED=10;
	private DigitalVideoDisc itemsOrdered[] =new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
			if(qtyOrdered==10) {
				System.out.println("Full Ordered Cart!");
			}else {
				itemsOrdered[qtyOrdered]=disc;
				qtyOrdered+=1;
				System.out.println("Added the disc "+itemsOrdered[qtyOrdered-1].getTitle()+"!");
			}
	}
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
//		int i;
//		for(i=0;i<dvdList.length;i++) {
//			addDigitalVideoDisc(dvdList[i]);
//		}
//	}
	public void addDigitalVideoDisc(DigitalVideoDisc... disc) {
		int i;
		for(i=0;i<disc.length;i++) {
			addDigitalVideoDisc(disc[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd2);
		addDigitalVideoDisc(dvd1);
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i;
		int index=-1;
		for(i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i].getTitle()==disc.getTitle()) {
				index=i;
				break;
			}
			if(i==qtyOrdered-1) index=-1;
		}
		if(index!=-1) {
		for(i=index+1;i<qtyOrdered;i++) {
			itemsOrdered[i-1]=itemsOrdered[i];
		}
		itemsOrdered[qtyOrdered-1]=null;
		qtyOrdered-=1;
		System.out.println("Remove disc "+disc.getTitle()+" complete!");
		}
		else {
			System.out.println("Disc not found in cart!");
		}
	}
	public float totalCost() {
		int i;
		float totalCost=0;
		for(i=0;i<qtyOrdered;i++) {
			totalCost+=itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	//Overload totalCost()
	public float totalCost(int luckyNum) {
		int i;
		float totalCost=0;
		for(i=0;i<qtyOrdered;i++) {
			if(i==luckyNum) continue;
			totalCost+=itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	public void getDetail() {
		System.out.println("**************CART*************");
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println(i+1+"."+itemsOrdered[i].getDetail());
		}
		System.out.println("Total cost: "+totalCost()+"$");
		System.out.println("*******************************");
	}
	//Overload getDetail()
	
	public void getDetail(DigitalVideoDisc luckyDigitalVideoDisc) {
		int luckyNum=-1;
		System.out.println("**************CART*************");
		for(int i=0;i<qtyOrdered;i++) {
			if(luckyDigitalVideoDisc!=itemsOrdered[i]) System.out.println(i+1+"."+itemsOrdered[i].getDetail());
			else {
				System.out.println(i+1+"."+itemsOrdered[i].getDetail()+"(FREE)");
				luckyNum=i;
			}
		}
		System.out.println("Total cost: "+totalCost(luckyNum)+"$");
		System.out.println("*******************************");
	}
	
	
	
	public void printSortedDVDsbyCost() {
		itemsOrdered=DVDUtils.sortDVDsByCost(itemsOrdered,qtyOrdered);
		getDetail();
	}
	public void printSortedDVDsbyTitle() {
		itemsOrdered=DVDUtils.sortDVDsByTitle(itemsOrdered,qtyOrdered);
		getDetail();
	}
	public void searchDVDsByID(int key) {
		int i;
		for(i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i].getId()==key) {
				System.out.println("Item found in Cart!");
				System.out.println(itemsOrdered[i].getDetail());
				break;
			}
		}
		if(i==qtyOrdered) System.out.println("No item found in Cart!");
	}
	public void printDefaultSortedDVDs() {
		int i,j;
		for(i=0;i<qtyOrdered-1;i++){
			for(j=i+1;j<qtyOrdered;j++) {
				if(DVDUtils.compareDVDsByTitle(itemsOrdered[i], itemsOrdered[j])==1) TestPassingParameter.swap1(itemsOrdered[i], itemsOrdered[j]);
				else if(DVDUtils.compareDVDsByTitle(itemsOrdered[i], itemsOrdered[j])==0) {
					if(DVDUtils.compareDVDsByCost(itemsOrdered[i], itemsOrdered[j])==-1)TestPassingParameter.swap1(itemsOrdered[i], itemsOrdered[j]);
					else if(DVDUtils.compareDVDsByCost(itemsOrdered[i], itemsOrdered[j])==0) {
						if(DVDUtils.compareDVDsByLength(itemsOrdered[i], itemsOrdered[j])==-1)TestPassingParameter.swap1(itemsOrdered[i], itemsOrdered[j]);
					}
				}
			}
		}
		getDetail();
	}
	public DigitalVideoDisc getALuckyItem() {
		int luckyNumber= (int)Math.random()%qtyOrdered;
		return itemsOrdered[luckyNumber];
	}
}
