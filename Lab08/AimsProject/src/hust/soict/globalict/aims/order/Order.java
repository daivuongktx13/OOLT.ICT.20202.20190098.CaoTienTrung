package hust.soict.globalict.aims.order;
import java.util.ArrayList;
import java.util.Random;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.utils.MediaUtils;
import hust.soict.globalict.test.disc.TestPassingParameter;
public class Order {
	public static final int MAX_NUMBERS_ORDERED=10;
	private ArrayList<Media> itemsOrdered=new ArrayList<Media>(MAX_NUMBERS_ORDERED);
	
	public void addMedia(Media... medias) {
		try {
			itemsOrdered.addAll(itemsOrdered);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Add collection of Medias complete!");
	}
	public void addMedia(Media media) {
		if(itemsOrdered.size()==10) {
			System.out.println("Cart is full!");
			return;
		}
		itemsOrdered.add(media);
		System.out.println("Add "+media.getTitle()+" complete!");
	}
	public float totalCost() {
		int i;
		float totalCost=0;
		for(i=0;i<itemsOrdered.size();i++) {
			totalCost+=itemsOrdered.get(i).getCost();
		}
		return totalCost;
	}
	//Overload totalCost()
	public float totalCost(int luckyNum) {
		int i;
		float totalCost=0;
		for(i=0;i<itemsOrdered.size();i++) {
			if(i==luckyNum) continue;
			totalCost+=itemsOrdered.get(i).getCost();
		}
		return totalCost;
	}
	public void getDetail() {
		System.out.println("**************CART*************");
		for(int i=0;i<itemsOrdered.size();i++) {
			System.out.println(i+1+"."+itemsOrdered.get(i).getDetail());
		}
		System.out.println("Total cost: "+totalCost()+"$");
		System.out.println("*******************************");
	}
	//Overload getDetail()
	
	public void getDetail(Media luckyMedia) {
		int luckyNum=-1;
		System.out.println("**************CART*************");
		for(int i=0;i<itemsOrdered.size();i++) {
			if(luckyMedia==itemsOrdered.get(i)) {
				System.out.println(i+1+"."+itemsOrdered.get(i).getDetail()+"(FREE)");
				luckyNum=i;
			}else {
				System.out.println(i+1+"."+itemsOrdered.get(i).getDetail());
			}
		}
		System.out.println("Total cost: "+totalCost(luckyNum)+"$");
		System.out.println("*******************************");
	}
	
	
	
	public void printSortedMediasbyCost() {
		itemsOrdered=MediaUtils.sortMediasByCost(itemsOrdered);
		getDetail();
	}
	public void printSortedMediasbyTitle() {
		itemsOrdered=MediaUtils.sortMediasByTitle(itemsOrdered);
		getDetail();
	}
	public int searchMediasByID(int key) {
		int i;
		for(i=0;i<itemsOrdered.size();i++) {
			if(itemsOrdered.get(i).getId()==key) {
				return i;
			}
		}
		return -1;
	}
	public void printDefaultSortedDVDs() {
		int i,j;
		for(i=0;i<itemsOrdered.size()-1;i++){
			for(j=i+1;j<itemsOrdered.size();j++) {
				if(MediaUtils.compareMediasByTitle(itemsOrdered.get(i), itemsOrdered.get(j))==1) TestPassingParameter.swap1(itemsOrdered.get(i), itemsOrdered.get(j));
				else if(MediaUtils.compareMediasByTitle(itemsOrdered.get(i), itemsOrdered.get(j))==0) {
					if(MediaUtils.compareMediasByCost(itemsOrdered.get(i), itemsOrdered.get(j))==-1)TestPassingParameter.swap1(itemsOrdered.get(i), itemsOrdered.get(j));
			
					}
				}
			}
		getDetail();
		}
		
	public Media getALuckyItem() {
		Random generator=new Random();
		int luckyNumber= generator.nextInt(itemsOrdered.size());
		return itemsOrdered.get(luckyNumber);
	}
//	public void removeItemByIndex(int index) {
//			if(itemsOrdered.isEmpty()) return;
//			if((index>=0)&&(index<itemsOrdered.size())) {
//				itemsOrdered.remove(index);
//				System.out.println("Remove complete!");
//				return;
//			}
//			System.out.println("Item not found");
//			return;
//	}
	public void removeItemById(int id) {
		if(itemsOrdered.isEmpty()) return;
		int index=searchMediasByID(id);
		if(index!=-1) {
			itemsOrdered.remove(index);
			System.out.println("Remove complete!");
			return;
		}
		System.err.println("Item not found");
	}
}
