package hust.soict.globalict.aims.database;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;

public class DataBase{
	private ArrayList<Media> dataMedias = new ArrayList<Media>();
	public void InputData(Media media) {
		dataMedias.add(media);
	}
	public void readDataBase() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream fi= new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\AimsProject\\src\\hust\\soict\\globalict\\aims\\database\\database.dat"));
		int z = 0;
		try {
			z=fi.readInt();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Detected data from previous: "+z);
		Media.setNumId(z);
		
		try {
			while(true) {
				Media media= (Media) fi.readObject();
				dataMedias.add(media);
			}
			
		} catch (EOFException e) {
			// TODO: handle exception
		}
		

		fi.close();
		
		// TODO Auto-generated constructor stub
//		DigitalVideoDisc media1=new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//		DigitalVideoDisc media2=new DigitalVideoDisc("Star Wars","Sciene Fiction","George Lucas",87,24.95f);
//		DigitalVideoDisc media3=new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//		DigitalVideoDisc media4=new DigitalVideoDisc("Harry Potter", "Adventure", 20.42f);
//		Book media5=new Book("Adventure of Songoku", "Adventure", 20.5f);
//		Book media6=new Book("Wukong and Master", "Adventure", 30.5f);
//		Book media7=new Book("How much does Youth cost?","Mentor",15.6f);
//		Book media8=new Book("Java and App Creating","Education",30.6f);
//		CompactDisc media9=new CompactDisc("Spring", "Classical Music", 20.65f, 100, "John", "Caster J");
//		CompactDisc media10=new CompactDisc("Run now", "E Music", 30.2f, 25, "MTP", "AnhHoang");
//		media9.addTrack("Hot Spring", 50);
//		media9.addTrack("Cold Spring",30);
//		media9.addTrack("Rain String",20);
//		media10.addTrack("We are not belong to each other", 5);
//		media10.addTrack("Run now", 10);
//		media10.addTrack("Sweet Sunday",10);
//		Media[] medias= {media1,media2,media3,media4,media5,media6,media7,media8,media9,media10};
//		dataMedias=new ArrayList<Media>(Arrays.asList(medias));
		
	}
	public void writeToFile() throws FileNotFoundException, IOException {
		int i;
		@SuppressWarnings("resource")
		ObjectOutputStream fo=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\AimsProject\\src\\hust\\soict\\globalict\\aims\\database\\database.dat"));
		int temp= Media.getNumId();
		fo.writeInt(temp);
		for(i=0;i<dataMedias.size();i++) {
			fo.writeObject(dataMedias.get(i));
		}
		System.out.println("Write complete to database.dat file");
		fo.close();
	}
	public ArrayList<Media> getDataMedias() {
		return dataMedias;
	}
	public void getDetail() {
		System.out.println("Database of Store");
		int i;
		for(i=0;i<dataMedias.size();i++) {
			System.out.println((i+1)+"."+dataMedias.get(i).getDetail());
		}
	}
	public void showInfoOfType(int n) {
		int i;
		int count=0;
		for(i=0;i<dataMedias.size();i++) {
			if(dataMedias.get(i).getType()==n) {
				System.out.println((count+1)+". "+dataMedias.get(i).getDetail());
				count++;
			}
		}
	}
	public Media getMedia(int n,int index) {
		index--;
		int i;
		int count=0;
		for(i=0;i<dataMedias.size();i++) {
			if(dataMedias.get(i).getType()==n) {
				if(count==index) return dataMedias.get(i);
				else {
					count++;
				}
			}
		}
		return null;
	}
	public void removeItemById(int id) {
		if(dataMedias.isEmpty()) return;
		int index;
		for(index=0;index<dataMedias.size();index++) {
			if(id==dataMedias.get(index).getId()) break;
		}
		if(index!=dataMedias.size()) {
			dataMedias.remove(index);
			System.out.println("Remove complete!");
			return;
		}
		System.err.println("Item not found");
	}

}