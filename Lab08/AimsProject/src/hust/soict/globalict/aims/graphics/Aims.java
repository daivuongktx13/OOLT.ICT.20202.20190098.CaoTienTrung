package hust.soict.globalict.aims.graphics;



import java.awt.EventQueue;

import hust.soict.globalict.aims.database.DataBase;

public class Aims {
	public static void main(String[] agrs) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				DataBase dataBase=new DataBase();
				StoreScreen frame=new StoreScreen(dataBase);
			}
		});
		
	}
}
