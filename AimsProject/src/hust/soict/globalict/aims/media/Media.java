package hust.soict.globalict.aims.media;

public abstract class Media {
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
		nbDigitalVideoDiscs++;
		this.id=nbDigitalVideoDiscs;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(float cost) {
		this.cost = cost;
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
	public static int getNumId() {
		return nbDigitalVideoDiscs;
	}
	
}
