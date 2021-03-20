
public class TestPassingParameter {
	public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tempDigitalVideoDisc=dvd1;
		dvd1=dvd2;
		dvd2=tempDigitalVideoDisc;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd ,String title) {
		String oldTitle=dvd.getTitle();
		dvd.setTitle(title);
		dvd=new DigitalVideoDisc(oldTitle);
	}
	public static void swap1(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		DigitalVideoDisc tempDigitalVideoDisc=new DigitalVideoDisc(dvd1.getTitle(),dvd1.getCategory(),dvd1.getDirector(),dvd1.getLength(),dvd1.getCost());
		dvd1.setCategory(dvd2.getCategory());
		dvd1.setCost(dvd2.getCost());
		dvd1.setDirector(dvd2.getDirector());
		dvd1.setLength(dvd2.getLength());
		dvd1.setTitle(dvd2.getTitle());	
		
		dvd2.setCategory(tempDigitalVideoDisc.getCategory());
		dvd2.setCost(tempDigitalVideoDisc.getCost());
		dvd2.setDirector(tempDigitalVideoDisc.getDirector());
		dvd2.setLength(tempDigitalVideoDisc.getLength());
		dvd2.setTitle(tempDigitalVideoDisc.getTitle());	
		
	}
	public static void main(String[] agr) {
		DigitalVideoDisc jungleDVD=new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
		swap1(jungleDVD,cinderellaDVD);
		System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
		System.out.println("Cinderella DVD title: "+cinderellaDVD.getTitle());
//		changeTitle(jungleDVD,cinderellaDVD.getTitle());
//		System.out.println("Jungle DVD title: "+jungleDVD.getTitle());
	}
}
