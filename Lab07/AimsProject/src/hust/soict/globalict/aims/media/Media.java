package hust.soict.globalict.aims.media;

import java.io.Serializable;

public abstract class Media implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static int nbDigitalVideoDiscs=0;
	protected int id;
	public int getId() {
		return id;
	}
	protected int type;
	protected String title;
	protected String category;
	protected float cost;

	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	public Media(String title) {
		this.title=title;
		Media.nbDigitalVideoDiscs++;
		this.id=Media.nbDigitalVideoDiscs;
	}	
	
	public Media(String title,String category) {
		this(title);
		this.category=category;
	}
	public int getType() {
		return type;
	}

	public Media(String title, String category,float cost) {
		// TODO Auto-generated constructor stub
		this(title,category);
		this.cost=cost;
	}
	public Media(Media media) {
		this.title=media.title;
		this.category=media.category;
		this.cost=media.cost;
		this.id=media.id;
	}
	public abstract String getDetail();
	public static void setNumId(int i) {
		nbDigitalVideoDiscs=i;
	}
	public static int getNumId() {
		return nbDigitalVideoDiscs;
	}
}
