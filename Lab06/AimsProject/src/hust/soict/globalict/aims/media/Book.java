package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Book extends Media{
	private ArrayList<String> authors=new ArrayList<String>();
	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		
	}
	
	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
		this.type=2;
	}
	public Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
		this.type=2;
	}
	public Book(Book book) {
		super(book);
		// TODO Auto-generated constructor stub
		this.authors=book.authors;
		this.type=2;
	}
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Author exist!");
			return;
		}
		authors.add(authorName);
	}
	public void removeAuthor(String authorName) {
		int i;
		for(i=0;i<authors.size();i++) {
			if(authorName==authors.get(i)) {
				authors.remove(i);
				return;
			}
		}
		System.out.println("Author does not exist in the list!");
	}
	
	@Override
	public String getDetail() {
		// TODO Auto-generated method stub
		return "Book - "+title+" - "+category+" - "+" : "+cost+"$";
	}
	
	
}
