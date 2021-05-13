package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Book extends Media{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<String> authors=new ArrayList<String>();
	public void setContent(String content) {
		this.content = content;
	}

	private String content;
	private List<String> contentTokens;
	private SortedMap<String, Integer> wordFrequency;
	
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
		return "Book - "+id+" - "+title+" - "+category+": "+cost+"$";
	}
	
	
	public void processContent() {
		try {
			String[] list=content.split(" ");
			//To lower case
			int i=0;
			while(i<list.length-1) {
				list[i]=list[i].toLowerCase();
				i++;
			}
			//Convert to contentTokens
			contentTokens=Arrays.asList(list);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		wordFrequency=new TreeMap<String,Integer>();
		Iterator<String> iterator=contentTokens.iterator();
		while(iterator.hasNext()) {
			String string=(String) iterator.next();
			wordFrequency.put(string, 0);
		}
		iterator=contentTokens.iterator();
		
		while(iterator.hasNext()) {
			String string=(String) iterator.next();
			wordFrequency.replace(string, wordFrequency.get(string)+1);
		}
		System.out.println("Process content complete!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder=new StringBuilder(getDetail());
		stringBuilder.append("\n").append("Content length: ").append(contentTokens.size()).append("\n");
		stringBuilder.append("Frequecy of word\n");
		Iterator<String> iterator=wordFrequency.keySet().iterator();
		while(iterator.hasNext()) {
			String string=(String) iterator.next();
			stringBuilder.append(string).append(" : ").append(wordFrequency.get(string)).append("\n");
		}
		String result=stringBuilder.toString();
		return result;
	}
}
