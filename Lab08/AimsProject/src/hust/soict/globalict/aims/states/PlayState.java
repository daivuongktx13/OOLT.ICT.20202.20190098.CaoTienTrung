package hust.soict.globalict.aims.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.globalict.aims.database.DataBase;
import hust.soict.globalict.aims.graphics.StoreScreen;
import hust.soict.globalict.aims.media.Media;

public class PlayState extends State implements ActionListener{
	Media media;
	public PlayState(DataBase database, StoreScreen screen,Media media) {
		super(database, screen);
		this.media=media;
		// TODO Auto-generated constructor stub
	}

	@Override
	public JPanel showState() {
		// TODO Auto-generated method stub
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		JLabel playing=new JLabel("Playing");
		//playing.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		playing.setFont(new Font(playing.getFont().getName(),Font.PLAIN,50));
		playing.setForeground(Color.BLUE);
		
		
		JLabel title=new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 30));
		
		
		JButton button=new JButton("Return");
		button.addActionListener(this);
		
		
		
		panel.add(playing);
		panel.add(Box.createVerticalGlue());
		panel.add(title);
		panel.add(Box.createVerticalGlue());
		panel.add(button);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		return panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		screen.setToStoreState();
	}

}
