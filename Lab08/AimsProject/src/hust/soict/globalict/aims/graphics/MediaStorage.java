package hust.soict.globalict.aims.graphics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.utils.Playable;

public class MediaStorage extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	Media media;
	StoreScreen screen;
	public MediaStorage(Media media,StoreScreen screen,int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.media=media;
		this.screen=screen;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title=new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost=new JLabel(""+media.getCost()+"$");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container=new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		container.add(new JButton("Add to cart"));
		
		if(media instanceof Playable) {
			JButton b1= new JButton("Play");
			container.add(b1);
			b1.addActionListener(this);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		screen.setToPlayState(id);
		SwingUtilities.updateComponentTreeUI(screen);
	}
}
