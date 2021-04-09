package hust.soict.globalict.garbage;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class GarbageCreator {
	public static void main(String[] agr) {
		String s="";
		long start=System.currentTimeMillis();
		File fi=new File("C:\\Users\\Admin\\eclipse-workspace\\OthersProject\\src\\hust\\soict\\globalict\\garbage\\text.txt");
		try {
			Scanner fileScanner=new Scanner(fi);
			int count=1;
			while(fileScanner.hasNext()) {
				if(count%15==0) s+= "\n";
				s=s+fileScanner.next()+" ";
				count++;
			}
			start=System.currentTimeMillis()-start;
			fileScanner.close();
		}catch (FileNotFoundException e) {
			System.out.println("Cannot open file!\n");
			e.printStackTrace();
		}
		System.out.println(s);
		System.out.println("The process take time: "+start/1000+" seconds!");
	}
}
