package hust.soict.globalict.aims.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class MyDate{
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	private int day;
	private int month;
	private int year;
	private ArrayList<String> tempoMonth;
	
	private String[] January= {"January","Jan","01","1"};
	private ArrayList<String> jan=new ArrayList<String>(Arrays.asList(January));
	private String[] February={"February","Feb","02","1"};
	private ArrayList<String> feb=new ArrayList<String>(Arrays.asList(February));
	private String[] March= {"March","Mar","03","3"};
	private ArrayList<String> mar=new ArrayList<String>(Arrays.asList(March));
	private String[] April= {"April","Apr","04","4"};
	private ArrayList<String> apr=new ArrayList<String>(Arrays.asList(April));
	private String[] May= {"May","May","05","5"};
	private ArrayList<String> may=new ArrayList<String>(Arrays.asList(May));
	private String[] June= {"June","Jun","06","6"};
	private ArrayList<String> jun=new ArrayList<String>(Arrays.asList(June));
	private String[] July= {"July","Jul","07","7"};
	private ArrayList<String> jul=new ArrayList<String>(Arrays.asList(July));
	private String[] August= {"August","Aug","08","8"};
	private ArrayList<String> aug=new ArrayList<String>(Arrays.asList(August));
	private String[] September= {"September","Sep","09","9"};
	private ArrayList<String> sep=new ArrayList<String>(Arrays.asList(September));
	private String[] October= {"October","Oct","10","10"};
	private ArrayList<String> oct=new ArrayList<String>(Arrays.asList(October));
	private String[] November= {"November","Nov","11","11"};
	private ArrayList<String> nov=new ArrayList<String>(Arrays.asList(November));
	private String[] December= {"December","Dec","12","12"};
	private ArrayList<String> dec=new ArrayList<String>(Arrays.asList(December));
	
	public MyDate(String day,String month,String year) {
		try {
			this.year=Integer.parseInt(year);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(this.year<=0) {
			System.out.println("Invalid year!");
			return;
		}
		this.month=parseMonth(month);
		if(this.month==-1) {
			System.out.println("Invalid month!");
			return;
		}
		int day1=-1;;
		try {
			
			day1=Integer.parseInt(day);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(checkValidDay(day1,this.month,isLeapYear(this.year))==false) {
			System.out.println("Invalid day in"+ this.month);
			return;
		}
		this.day=day1;
	}
	public MyDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public static int isLeapYear(int year){
		if(year%100==0) {
			if(year%400==0)return 1;
			else return 0;
		}else {
			if(year%4==0) return 1;
		}
		return 0;
	}
	
	public int parseMonth(String month) {
		if(jan.contains(month)) {
			tempoMonth=jan;
			return 1;
		}
		if(feb.contains(month)) {
			tempoMonth=feb;
			return 2;
		}
		if(mar.contains(month)) {
			tempoMonth=mar;
			return 3;
		}
		if(apr.contains(month)) {
			tempoMonth=apr;
			return 4;
		}
		if(may.contains(month)) {
			tempoMonth=may;
			return 5;
		}
		if(jun.contains(month)) {
			tempoMonth=jun;
			return 6;
		}
		if(jul.contains(month)) {
			tempoMonth=jul;
			return 7;
		}
		if(aug.contains(month)) {
			tempoMonth=aug;
			return 8;
		}
		if(sep.contains(month)) {
			tempoMonth=sep;
			return 9;
		}
		if(oct.contains(month)) {
			tempoMonth=oct;
			return 10;
		}
		if(nov.contains(month)) {
			tempoMonth=nov;
			return 11;
		}
		if(dec.contains(month)) {
			tempoMonth=dec;
			return 12;
		}
		tempoMonth=null;
		return -1;
	}
	public boolean checkValidDay(int day,int month,int leapYear){
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(day<1||day>31) return false;
				break;
			case 2:if(leapYear==1) if(day<1||day>29) return false;
				if(leapYear==0) if(day<1||day>28) return false;
			case 4:
			case 6:
			case 9:
			case 11:
				if(day<1||day>30) return false;
			}
			return true;
	}
	public void print() {
		StringBuffer stringBuffer=new StringBuffer();
		stringBuffer.append(tempoMonth.get(1)).append(" ").append(day);
		if(day==1) stringBuffer.append("st");
		if(day==2) stringBuffer.append("nd");
		if(day==3) stringBuffer.append("rd");
		if(day>=4) stringBuffer.append("th");
		stringBuffer.append(" ").append(year);
		String string=stringBuffer.toString();
		System.out.println(string);
	}
	public void printddMMMyyyy(){
		StringBuffer stringBuffer=new StringBuffer();
		if(day<10) stringBuffer.append("0").append(day);
		else stringBuffer.append(day);
		stringBuffer.append("-").append(tempoMonth.get(1)).append("-").append(year);
		String string=stringBuffer.toString();
		System.out.println(string);
	}

}