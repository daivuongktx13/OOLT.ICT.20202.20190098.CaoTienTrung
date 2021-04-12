package hust.soict.globalict.aims.menu;
import java.io.IOException;
import java.util.Scanner;

import hust.soict.globalict.aims.database.DataBase;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.disc.CompactDisc;
import hust.soict.globalict.aims.media.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.order.Order;

public class UserMenu implements Menu {
	@Override
	public void showMenuConsole(){
		Order anOrder=null;
		DataBase anDataBase = null;
		anDataBase = new DataBase();
		try {
			anDataBase.readDataBase();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner keyboard=new Scanner(System.in);
		int choice=0,choice2=0,choice3=0;
		do {
			System.out.println();
			showMenuContent();
			choice=keyboard.nextInt();
			switch(choice) {
			case 1://Create order
				anOrder=new Order();
				System.out.println("Create an order complete!");
			break;
			case 2://Add item
				System.out.println("Which one do you want to pick: ");
				System.out.println("1.DVD");
				System.out.println("2.Book");
				System.out.println("3.CD");
				System.out.print("Your choice: ");
				choice2=keyboard.nextInt();
				
				switch(choice2) {
				case 1://DVD
				anDataBase.showInfoOfType(1);
				System.out.println("Your choice: ");
				choice3=keyboard.nextInt();
				DigitalVideoDisc dvd=(DigitalVideoDisc) anDataBase.getMedia(1,choice3);
				if(dvd!=null) {
					System.out.println("Do you want to play the dvd");
					System.out.println("1.Yes");
					System.out.println("2.No");
					choice3=keyboard.nextInt();
					if(choice3==1) dvd.play();
					System.out.println("Do you want to add? ");
					System.out.println("1.Yes");
					System.out.println("2.No");
					System.out.print("Your choice: ");
					choice3=keyboard.nextInt();
					try {
						if(choice3==1) anOrder.addMedia(dvd);
					} catch (NullPointerException e) {
						// TODO: handle exception
						System.err.println("Order have not been created yet");
					}
				}
				break;
				case 2://Book
				anDataBase.showInfoOfType(2);
				System.out.println("Your choice: ");
				choice3=keyboard.nextInt();
				Book book=(Book) anDataBase.getMedia(2,choice3);
				if(book!=null) {
					System.out.println("Do you want to add? ");
					System.out.println("1.Yes");
					System.out.println("2.No");
					System.out.print("Your choice: ");
					choice3=keyboard.nextInt();
					try {
						if(choice3==1) anOrder.addMedia(book);
					} catch (NullPointerException e) {
						// TODO: handle exception
						System.err.println("Order have not been created yet");
					}
					
				}
				break;
				case 3://CD
				anDataBase.showInfoOfType(3);
				System.out.println("Your choice: ");
				choice3=keyboard.nextInt();
				CompactDisc cd=(CompactDisc) anDataBase.getMedia(3,choice3);
				if(cd!=null) {
					System.out.println("Do you want to play the dvd");
					System.out.println("1.Yes");
					System.out.println("2.No");
					choice3=keyboard.nextInt();
					if(choice3==1) cd.play();
					System.out.println("Do you want to add? ");
					System.out.println("1.Yes");
					System.out.println("2.No");
					System.out.print("Your choice: ");
					choice3=keyboard.nextInt();
					try {
						if(choice3==1) anOrder.addMedia(cd);
					} catch (NullPointerException e) {
						// TODO: handle exception
						System.err.println("Order have not been created yet");
					}
					
				}
				break;
				default: System.err.println("Wrong choice");
				}
				break;
			case 3://Delete item
				try {
					int index=0;
					System.out.print("Enter id of the item in cart to remove: ");
					index=keyboard.nextInt();
					anOrder.removeItemById(index);
				} catch (NullPointerException e) {
					// TODO: handle exception
					System.err.println("Order have not been created yet");
				}
				
				break;
			case 4://Show the list
				try {
					anOrder.getDetail();
				} catch (NullPointerException e) {
					// TODO: handle exception
					System.err.println("Order have not been created yet");
				}
				
				break;
			case 0:
				break;
			default: System.err.println("Wrong choice!");
			}
		}while(choice!=0);
		keyboard.close();
	}
	@Override
	public void showMenuContent() {
		System.out.println("Order Management Application: ");
		System.out.println("------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to order(not by id)");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("-------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		System.out.print("Your choice: ");
	}

}
