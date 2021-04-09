package hust.soict.globalict.test.utils;

import hust.soict.globalict.aims.utils.DateUtils;
import hust.soict.globalict.aims.utils.MyDate;

public class DateTest {
	public static void main(String[] agrs) {
		MyDate date1= new MyDate("01","Mar","2001");
		MyDate date2= new MyDate("10", "March", "2001");
		MyDate date3=new MyDate("20", "Feb", "2000");
		MyDate date4=new MyDate("31","Dec","2002");
		MyDate date5=new MyDate("20","1", "1999");
		MyDate date6=new MyDate("25", "02", "2001");
		MyDate date7=new MyDate("26", "3", "2001");
		MyDate[] dates= {date1,date2,date3,date4,date5,date6,date7};
		System.out.println("Test print date:");
		date1.print();
		date2.print();
		System.out.println("Print date in form dd-MMM-yyyy");
		date1.printddMMMyyyy();
		date2.printddMMMyyyy();
		DateUtils.sortDates(dates);
		int i;
		System.out.println("Sorted List:");
		for(i=0;i<dates.length;i++) {
			dates[i].print();
		}
		
	
	}
}
