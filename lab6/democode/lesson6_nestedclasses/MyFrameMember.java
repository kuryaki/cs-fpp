package lesson6_nestedclasses;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This version of MyFrame uses a member inner class as a listener
 *
 */
public class MyFrameMember extends JFrame {

	//make the text field and label instance variables in MyFrame JTextField text;
	JLabel label;
	JTextField text;
	public MyFrameMember(){
		initializeWindow();
		JPanel mainPanel = new JPanel();
		
		text = new JTextField(10);
		label = new JLabel("My Text");
		JButton button = new JButton("My Button");
		
		//Registering the listener with button using a member inner class
		button.addActionListener(new ButtonListener());
		mainPanel.add(text);
		mainPanel.add(label);
		mainPanel.add(button);
		getContentPane().add(mainPanel);
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			JButton butn = (JButton)evt.getSource();
			System.out.println("Button height = " + butn.getSize().height);
			text.setText("button press");
		}
	}
	
	public void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");
		setSize(320, 240); // see NOTE below
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
				MyFrameMember mf = new MyFrameMember();
				mf.setVisible(true);
			}
		});
	}
	private static final long serialVersionUID = -5565229515686514125L;
}
