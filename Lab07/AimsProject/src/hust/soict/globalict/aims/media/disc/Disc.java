package hust.soict.globalict.aims.media.disc;

import hust.soict.globalict.aims.media.Media;

public abstract class Disc extends Media {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String director;
	protected int length;
	
	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}
	
	public Disc(Media media) {
		super(media);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title,String category,float cost,int length,String director) {
		this(title,category,cost);
		this.director=director;
		this.length=length;
	}
	public abstract String getDetail();
	

}
