package hust.soict.globalict.aims.database;

import java.util.ArrayList;
import java.util.Arrays;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class DataBase{
	private ArrayList<Media> dataMedias;
	public DataBase() {
		// TODO Auto-generated constructor stub
		Media media1=new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		Media media2=new DigitalVideoDisc("Star Wars","Sciene Fiction","George Lucas",87,24.95f);
		Media media3=new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		Media media4=new DigitalVideoDisc("Harry Potter", "Adventure", 20.42f);
		Media media5=new Book("Adventure of Songoku", "Adventure", 20.5f);
		Media media6=new Book("Wukong and Master", "Adventure", 30.5f);
		Media media7=new Book("How much does Youth cost?","Mentor",15.6f);
		Media media8=new Book("Java and App Creating","Education",30.6f);
		Media[] medias= {media1,media2,media3,media4,media5,media6,media7,media8};
		dataMedias=new ArrayList<Media>(Arrays.asList(medias));
	}
	public ArrayList<Media> getDataMedias() {
		return dataMedias;
	}
	

}
