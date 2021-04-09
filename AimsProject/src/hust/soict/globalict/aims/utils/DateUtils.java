package hust.soict.globalict.aims.utils;

public class DateUtils {
	public static int compareDate(MyDate date1,MyDate date2) {
		if(date1.getYear()>date2.getYear()) return 1;
		if(date1.getYear()<date2.getYear()) return -1;
		else {
			if(date1.getMonth()>date2.getMonth()) return 1;
			if(date1.getMonth()>date2.getMonth()) return -1;
			else {
				if(date1.getDay()>date2.getDay()) return 1;
				if(date1.getDay()<date2.getDay()) return -1;
				else return 0;
			}
		}
	}
	public static void sortDates(MyDate[] dates) {
		int i,j;
		for(i=0;i<dates.length-1;i++) {
			for(j=i;j<dates.length;j++) {
				if(compareDate(dates[i], dates[j])==1) swapDate(dates[i], dates[j]);
			}
		}
		System.out.println("Sort complete!");
	}
	public static void swapDate(MyDate date1,MyDate date2) {
		MyDate temp=new MyDate(date1.getDay(), date1.getMonth(), date1.getYear());
		date1.setDay(date2.getDay());
		date1.setMonth(date2.getMonth());
		date1.setYear(date2.getYear());
		date2.setDay(temp.getDay());
		date2.setMonth(temp.getMonth());
		date2.setYear(temp.getYear());
	}
}
