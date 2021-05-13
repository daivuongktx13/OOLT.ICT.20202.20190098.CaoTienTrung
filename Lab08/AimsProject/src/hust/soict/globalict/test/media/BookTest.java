package hust.soict.globalict.test.media;



import hust.soict.globalict.aims.media.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book("Java and App Creating","Education",30.6f);
		book.setContent("JAVA was developed by Sun Microsystems Inc in 1991 later acquired by Oracle Corporation It was developed by James Gosling and Patrick Naughton It is a simple programming language Writing compiling and debugging a program is easy in java It helps to create modular programs and reusable code");
		book.processContent();
		System.out.println("------------------------------");
		System.out.println(book.toString());
		System.out.print("------------------------------");
	}

}
