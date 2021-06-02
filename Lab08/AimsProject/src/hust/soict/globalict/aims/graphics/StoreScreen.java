package hust.soict.globalict.aims.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import hust.soict.globalict.aims.database.DataBase;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.states.PlayState;
import hust.soict.globalict.aims.states.StatesManager;
import hust.soict.globalict.aims.states.StoreState;

public class StoreScreen extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DataBase database;
	private StatesManager statesManager;
	public StoreScreen(DataBase dataBase) {
		// TODO Auto-generated constructor stub
		this.database=dataBase;
		try {
			database.readDataBase();
			statesManager=new StatesManager();
		} catch (ClassNotFoundException | IOException |NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		statesManager.setState(new StoreState(database,this));
		cp.add(statesManager.showState(),BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Store");
		setSize(800,600);
	}
	public JPanel createNorth() {
		// TODO Auto-generated method stub
		JPanel north=new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	public JMenuBar createMenuBar() {
		JMenu menu=new JMenu("Options");
		JMenu smUpdateStore =new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));
		
		JMenuBar menuBar=new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	public JPanel createHeader() {
		// TODO Auto-generated method stub
		JPanel header=new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title=new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(),Font.PLAIN,50));
		title.setForeground(Color.CYAN);
		
		JButton cart=new JButton("Cart");
		cart.setPreferredSize(new Dimension(100, 50));
		cart.setMaximumSize(new Dimension(100,50));
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cart);
		header.add(Box.createRigidArea(new Dimension(10,10)));
		return header;
	}
	public void setToPlayState(int itemId) {
		Container cp=getContentPane();
		ArrayList<Media> medias=database.getDataMedias();
		statesManager.setState(new PlayState(database,this,medias.get(itemId)));
		cp.remove(1);
		cp.add(statesManager.showState(),BorderLayout.CENTER);
		SwingUtilities.updateComponentTreeUI(this);
	}
	public void setToStoreState() {
		Container cp=getContentPane();
		statesManager.setState(new StoreState(database,this));
		cp.remove(1);
		cp.add(statesManager.showState(),BorderLayout.CENTER);
		SwingUtilities.updateComponentTreeUI(this);
	}
}
