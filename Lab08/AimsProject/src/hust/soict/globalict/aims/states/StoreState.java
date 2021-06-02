package hust.soict.globalict.aims.states;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import hust.soict.globalict.aims.database.DataBase;
import hust.soict.globalict.aims.graphics.MediaStorage;
import hust.soict.globalict.aims.graphics.StoreScreen;
import hust.soict.globalict.aims.media.Media;

public class StoreState extends State {
	public StoreState(DataBase database, StoreScreen screen) {
		super(database, screen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public JPanel showState() {
		// TODO Auto-generated method stub
		JPanel center=new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		ArrayList<Media> medias=database.getDataMedias();
		try {
			int i;
			for(i=0;i<9;i++) {
				MediaStorage cell=new MediaStorage(medias.get(i),screen,i);
				center.add(cell);
			}
		}catch(Exception e) {
			
		}
		return center;
	}
}
