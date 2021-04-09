package hust.soict.globalict.aims;
import java.util.Scanner;

import hust.soict.globalict.aims.database.DataBase;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.order.Order;
public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("------------------------------");
		System.out.println("1.Create new order");
		System.out.println("2.Add item to order");
		System.out.println("3.Delete item by id");
		System.out.println("4.Display the items list of order");
		System.out.println("0.Exit");
		System.out.println("-------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		System.out.print("Your choice: ");
	}
	public static void main(String[] agrs) {
		Order anOrder=null;
		DataBase dtb=new DataBase();
		int choice=0;
		Scanner keyboard=new Scanner(System.in);
		do {
			System.out.println();
			showMenu();
			choice=keyboard.nextInt();
			switch(choice) {
			case 1://Create order
				anOrder=new Order();
				System.out.println("Create an order complete!");
			break;
			case 2://Add item
				int itemChoice;
				System.out.print("Our shop has items with Id from: ");
				System.out.println("1-"+Media.getNumId());
				System.out.print("Which one do you want to pick: ");
				itemChoice=keyboard.nextInt();
				System.out.println(dtb.getDataMedias().get(itemChoice-1).getDetail());
				int confirmAdd;
				System.out.println("Do you want to add?(1 for Yes-2 for No)");
				confirmAdd=keyboard.nextInt();
				if(confirmAdd==1) anOrder.addMedia(dtb.getDataMedias().get(itemChoice-1));
				break;
			case 3://Delete item
				int id;
				System.out.println("Input id of the media: ");
				id=keyboard.nextInt();
				int index=anOrder.searchMediasByID(id);
				if(index!=-1) anOrder.removeItemByIndex(index);
				else System.out.println("Item not found in cart!");
				break;
			case 4://Show the list
				anOrder.getDetail();
				break;
			case 0:
				break;
			default: System.out.println("Wrong choice!");
			}
			
		}while(choice!=0);
		keyboard.close();
	}
}
