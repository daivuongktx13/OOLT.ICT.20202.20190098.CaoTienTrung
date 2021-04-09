
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
	
}
