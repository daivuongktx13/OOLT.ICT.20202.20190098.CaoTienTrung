package hust.soict.globalict.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoGarbage {
	
	public static void main(String[] agr) {
		StringBuffer stringBuffer=new StringBuffer("1");
		long start=System.currentTimeMillis();
		File fi=new File("C:\\Users\\Admin\\eclipse-workspace\\OthersProject\\src\\hust\\soict\\globalict\\garbage\\text.txt");
		try {
			Scanner fileScanner=new Scanner(fi);
			int count=1;
			while(fileScanner.hasNext()) {
				if(count%15==0) stringBuffer.append("\n");
				stringBuffer.append(fileScanner.next()).append(" ");
				count++;
			}
			start=System.currentTimeMillis()-start;
			fileScanner.close();
		}catch (FileNotFoundException e) {
			System.out.println("Cannot open file!\n");
			e.printStackTrace();
		}
		String string=stringBuffer.toString();
		System.out.println(string);
		System.out.println("The process take time: "+start+" miliseconds!");
	}
}
