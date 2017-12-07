package lesson5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This is the final version of MyFrame. It illustrates use of inner classes for
 * listeners.
 * 
 * @author Administrator
 *
 */
public class MyFrame4 extends JFrame {

	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel textPanel;
	private JTextField text;
	private JLabel label;
	private JButton button;

	public MyFrame4() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		getContentPane().add(mainPanel);
	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		defineTextPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		topPanel.add(textPanel);
	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		button = new JButton("My Button");
		button.addActionListener(new MyButtonListener());
		middlePanel.add(button);
	}

	private void defineTextPanel() {

		text = new JTextField(10);
		label = new JLabel("My Text");
		label.setFont(makeSmallFont(label.getFont()));

		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(text, BorderLayout.NORTH);
		textPanel.add(label, BorderLayout.CENTER);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");
		centerFrameOnDesktop(this);
		setSize(320, 160);
		setResizable(false);
	}

	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyFrame4 mf = new MyFrame4();
				mf.setVisible(true);
			}
		});
	}

	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String textVal = text.getText();
			final String prompt = "Type a string";
			final String youWrote = "You wrote: ";
			if (textVal.equals("") || textVal.equals(prompt) || textVal.startsWith(youWrote)) {

				text.setText(prompt);
			} else {
				text.setText(youWrote + "\"" + textVal + "\".");
			}
		}
	}

	private static final long serialVersionUID = 3618976789175941431L;
}
