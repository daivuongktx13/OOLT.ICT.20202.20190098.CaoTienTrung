package hust.soict.globalict.aims.media.factory;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.Media;

public class BookFactory  extends MediaFactory{

	@Override
	public Book createMedia() {
		System.out.print("Enter book title: ");
		String title=sc.next();
		System.out.print("Enter category of the book: ");
		String category=sc.next();
		System.out.print("Enter cost: ");
		float cost=sc.nextFloat();
		Book book=new Book(title, category, cost);
		System.out.println("Enter authors name: ");
		int i=0;
		String author;
		do {
			System.out.println("Enter # to return: ");
			System.out.println("Author "+(i+1)+" : ");
			author=sc.next();
			if(author.equals("#")==false) {
				book.addAuthor(author);
				i++;
			}
		}while(author.equals("#")==false);
		return book;
	}
	
}
