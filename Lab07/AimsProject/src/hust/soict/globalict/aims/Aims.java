package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.menu.AdminMenu;
import hust.soict.globalict.aims.menu.Menu;
import hust.soict.globalict.aims.menu.UserMenu;

public class Aims {
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Aims application");
		System.out.println("1.User");
		System.out.println("2.Admin");
		System.out.print("Your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1://User mode
			Menu userMenu= new UserMenu();
			userMenu.showMenuConsole();
			break;
		case 2://Admin mode
			Menu adminMenu= new AdminMenu();
			adminMenu.showMenuConsole();
			break;
		default://Wrong choice
			System.out.println("Wrong choice");
			break;
		}
		sc.close();
	}
}
