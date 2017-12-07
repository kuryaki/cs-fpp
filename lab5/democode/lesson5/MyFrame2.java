package lesson5;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This version of MyFrame illustrates use of the default layout manager to organize
 * components on the screen.
 *
 */
public class MyFrame2 extends JFrame {

	//make the text field and label instance variables in MyFrame JTextField text;
	JLabel label;
	JTextField text;
	public MyFrame2(){
		initializeWindow();
		JPanel mainPanel = new JPanel();
		//num columns is 10; column width is width of an 'm' in the current font
		text = new JTextField(10);
		label = new JLabel("My Text");
		JButton button = new JButton("My Button");
		mainPanel.add(text);
		mainPanel.add(label);
		mainPanel.add(button);		
		getContentPane().add(mainPanel);
	}
	public void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");
		setSize(320, 240);
		centerFrameOnDesktop(this);
		setResizable(false);
	}
	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2), (height - frameHeight) / 3);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				MyFrame2 mf = new MyFrame2();
				mf.setVisible(true);
			}
		});
	}
	private static final long serialVersionUID = -5565229515686514125L;
}
