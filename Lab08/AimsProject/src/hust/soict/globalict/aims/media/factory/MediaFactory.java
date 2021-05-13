package hust.soict.globalict.aims.media.factory;

import java.util.Scanner;

import hust.soict.globalict.aims.media.Media;

public abstract class MediaFactory {
	Scanner sc=new Scanner(System.in);
	public abstract Media createMedia();
}
