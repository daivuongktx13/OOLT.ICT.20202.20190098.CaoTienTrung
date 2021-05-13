package hust.soict.globalict.aims.menu;

import java.io.IOException;
import java.util.Scanner;

import hust.soict.globalict.aims.database.DataBase;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.factory.BookFactory;
import hust.soict.globalict.aims.media.factory.CDFactory;
import hust.soict.globalict.aims.media.factory.DVDFactory;
import hust.soict.globalict.aims.media.factory.MediaFactory;

public class AdminMenu implements Menu{

	@Override
	public void showMenuContent() {
		// TODO Auto-generated method stub
		System.out.println("Product Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new item");
		System.out.println("2. Delete item by id");
		System.out.println("3. Display the items list");
		System.out.println("4. Write to dat file");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		System.out.print("Your choice: ");
	}

	@Override
	public void showMenuConsole() {
		// TODO Auto-generated method stub
		int choice,choice2;
		DataBase anDataBase=new DataBase();
		try {
			anDataBase.readDataBase();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Cannot file the file");
		}
		Scanner keyboard=new Scanner(System.in);
		do {
			showMenuContent();
			choice=keyboard.nextInt();
			switch(choice) {
			case 1://Create item
				System.out.println("Which one do you want to create: ");
				System.out.println("1.DVD");
				System.out.println("2.Book");
				System.out.println("3.CD");
				System.out.print("Your choice: ");
				choice2=keyboard.nextInt();
				switch(choice2) {
				case 1://DVD
					MediaFactory dvdFactory=new DVDFactory();
					Media newDVD= dvdFactory.createMedia();
					anDataBase.InputData(newDVD);
					System.out.println("Add complete!");
					break;
				case 2: //Book
					MediaFactory bookFactory=new BookFactory();
					Media newBook=bookFactory.createMedia();
					anDataBase.InputData(newBook);
					System.out.println("Add complete!");
					break;
				case 3: //CD
					MediaFactory cdFactory=new CDFactory();
					Media newCD=cdFactory.createMedia();
					anDataBase.InputData(newCD);
					System.out.println("Add complete!");
					break;
				case 0://Exit
					break;
				default://Wrong choice
					System.err.println("Wrong choice!");
					break;
				}
				break;
			case 2://Delete item by ID
				int index;
				System.out.print("Enter ID of the item in database to remove: ");
				index=keyboard.nextInt();
				anDataBase.removeItemById(index);
				break;
			case 3://Display information
				anDataBase.getDetail();
				break;
			case 4://Write to dat file
				try {
					anDataBase.writeToFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 0:
				break;
			default: //Wrong choice
				System.err.println("Wrong choice");	
			}
		}while(choice!=0);
		keyboard.close();
	}


}
