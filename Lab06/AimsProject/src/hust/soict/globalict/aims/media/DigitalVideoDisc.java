package hust.soict.globalict.aims.media;
import hust.soict.globalict.aims.utils.MyDate;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	private MyDate dateAdded;
	private int id;
	
	@Override
	public String getDetail() {
		return "DVD - "+title+" - "+category+" - "+director+" - "+length+" : "+cost+"$";
	}
	public MyDate getDateAdded() {
		return dateAdded;
	}
	public int getId() {
		return id;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(DigitalVideoDisc dvd) {
		super(dvd);
		// TODO Auto-generated constructor stub
		this.id=dvd.id;
		this.dateAdded=dvd.dateAdded;
		this.director=dvd.director;
		this.length=dvd.length;
		this.type=1;
	}
	public DigitalVideoDisc(String title) {
		super(title);
		this.type=1;
		// TODO Auto-generated constructor stub
	}
	public DigitalVideoDisc(String title,String category, float cost) {
		super(title, category, cost);
		this.type=1;
	}
	public DigitalVideoDisc(String director, String category,String title, float cost) {
		super(title, category, cost);
		this.director=director;
		this.type=1;
	}
	public DigitalVideoDisc(String title,String category,String director,int length,float cost) {
		super(title, category, cost);
		this.director=director;
		this.length=length;
		this.type=1;
	}
	public boolean search(String title) {
		 String[] tempStrings= title.split(" ");
		 int i;
		 for(i=0;i<tempStrings.length;i++) {
			if(!this.title.contains(tempStrings[i])) {
				return false;
			}
		 }
		 return true;
	}

}