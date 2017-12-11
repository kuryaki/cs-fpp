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
public class MyFrameStaticNested extends JFrame {

	//make the text field and label instance variables in MyFrame JTextField text;
	private JLabel label;
	private JTextField text;
	public MyFrameStaticNested(){
		initializeWindow();
		JPanel mainPanel = new JPanel();

		text = new JTextField(10);
		label = new JLabel("My Text");
		JButton button = new JButton("My Button");

		//Registering the listener with button using a member inner class
		button.addActionListener(new ButtonListener(text));
		mainPanel.add(text);
		mainPanel.add(label);
		mainPanel.add(button);
		getContentPane().add(mainPanel);
	}

	static class ButtonListener implements ActionListener {
		JTextField text;
		public ButtonListener(JTextField text) {
			this.text = text;
		}
		public void actionPerformed(ActionEvent evt){
			String textVal = text.getText();
			final String prompt = "Type a string";
			final String youWrote = "You wrote: ";
			if(textVal.equals("") ||
					textVal.equals(prompt) ||
					textVal.startsWith(youWrote)){

				text.setText(prompt);
			}
			else {
				text.setText(youWrote+"\""+textVal+"\".");
			}
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
				MyFrameStaticNested mf = new MyFrameStaticNested();
				mf.setVisible(true);
			}
		});
	}
	private static final long serialVersionUID = -5565229515686514125L;
}
