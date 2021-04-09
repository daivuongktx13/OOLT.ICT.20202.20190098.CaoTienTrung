package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] agr) {
		Random r=new Random(123);
		long start=System.currentTimeMillis();
		String string="";
		for(int i=0;i<65536;i++) {
			string+=r.nextInt(2);
		}
		System.out.println(System.currentTimeMillis()-start);
		
		r=new Random(123);
		start= System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<65536;i++) {
			sb.append(r.nextInt(2));
		}
		string=sb.toString();
		System.out.println(System.currentTimeMillis()-start);
		
		r=new Random(123);
		start= System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer();
		for(int i=0;i<65536;i++) {
			stringBuffer.append(r.nextInt(2));
		}
		string=stringBuffer.toString();
		System.out.println(System.currentTimeMillis()-start);
	}
}
