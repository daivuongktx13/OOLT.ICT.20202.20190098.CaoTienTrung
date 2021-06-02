package hust.soict.globalict.aims.graphics;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelDemo extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LookAndFeelDemo() {
		// TODO Auto-generated constructor stub
		addDemoComponents();
		addLookAndFeelCombobox();
		setSize(500, 500);
		setVisible(true);
		
	}
	public void addDemoComponents() {
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Label:"));
		cp.add(new JTextField("Text Field"));
		cp.add(new JRadioButton("Radio Button"));
		cp.add(new Button("Button"));
	}
	public void addLookAndFeelCombobox() {
		Container cp=getContentPane();
		cp.add(new Label("Change look and feel here: "));
		String javaLaf= UIManager.getCrossPlatformLookAndFeelClassName();
		String sysLaf=UIManager.getSystemLookAndFeelClassName();
		UIManager.installLookAndFeel("Java", javaLaf);
		UIManager.installLookAndFeel("System", sysLaf);
		LookAndFeelInfo[] lafInfos= UIManager.getInstalledLookAndFeels();
		String[] lafNames= new String[lafInfos.length];
		for(int i=0;i<lafInfos.length;i++) {
			lafNames[i]=lafInfos[i].getName();
			System.out.println(lafNames[i]);
		}
		
		JComboBox<String> cbLookAndFeel =new JComboBox<String>(lafNames);
		cp.add(cbLookAndFeel);
		Frame frame=this;
		cbLookAndFeel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int index=cbLookAndFeel.getSelectedIndex();
				try {
					UIManager.setLookAndFeel(lafInfos[index].getClassName());
				}catch(Exception exception){
					exception.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(frame);
				setTitle(lafInfos[index].getName()+" Look And Feel");
			}
		});
		
	}
	public static void main(String[] agrs) {
		new LookAndFeelDemo();
	}
}
