package hust.soict.globalict.aims.disc;

import java.time.LocalDate;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs=0;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private LocalDate dateAdded;
	private int id;
	public String getDetail() {
		return "DVD -"+title+" - "+category+" - "+director+" - "+length+" : "+cost+"$";
	}
	public LocalDate getDateAdded() {
		return dateAdded;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public DigitalVideoDisc(String title) {
		this.title=title;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title,String category, float cost) {
		this.category=category;
		this.title=title;
		this.cost=cost;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String director, String category,String title, float cost) {
		this.category=category;
		this.title=title;
		this.cost=cost;
		this.director=director;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title,String category,String director,int length,float cost) {
		this.category=category;
		this.title=title;
		this.cost=cost;
		this.director=director;
		this.length=length;
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
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