package prog5_1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel bottomPanel;
	private JTextField name;
	private JTextField street;
	private JTextField city;
	private JTextField state;
	private JTextField zip;
	private JButton button;
	
	public MyFrame() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineBottomPannel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
		
	}
	
	private void defineBottomPannel() {
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		button = new JButton("Submit");
		button.addActionListener(new MyButtonListener());
		bottomPanel.add(button);
	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		
		name = defineTextField();
		JPanel namePanel = defineTextPanel("Name", name);
		
		street = defineTextField();
		JPanel streetPanel = defineTextPanel("Street", street);
		city = defineTextField();
		JPanel cityPanel = defineTextPanel("City", city);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(namePanel);
		topPanel.add(streetPanel);
		topPanel.add(cityPanel);
	}
	
	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		
		state = defineTextField();
		JPanel statePanel = defineTextPanel("State", state);
		
		zip = defineTextField();
		JPanel zipPanel = defineTextPanel("Zip", zip);
		
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		middlePanel.add(statePanel);
		middlePanel.add(zipPanel);
	}

	private JTextField defineTextField() {
		JTextField text = new JTextField(10);
		return text;
	}

	private JPanel defineTextPanel(String labelText, JTextField text) {

		JPanel textPanel = new JPanel();
		
		JLabel label = new JLabel(labelText);
		label.setFont(makeSmallFont(label.getFont()));

		textPanel.setLayout(new BorderLayout());
		textPanel.add(text, BorderLayout.SOUTH);
		textPanel.add(label, BorderLayout.NORTH);
		
		return textPanel;
	}

	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Hello World");
		centerFrameOnDesktop(this);
		setSize(500, 200);
		setResizable(false);
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
				MyFrame mf = new MyFrame();
				mf.setVisible(true);
			}
		});
	}
	
	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String nameVal = name.getText();
			String streetVal = street.getText();
			String cityVal = city.getText();
			String stateVal = state.getText();
			String zipVal = zip.getText();
			
			System.out.println(nameVal);
			System.out.println(streetVal);
			System.out.println(cityVal + ", " + stateVal + " " + zipVal);
			
		}
	}

}
