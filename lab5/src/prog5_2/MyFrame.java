package prog5_2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MyFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textInput = new JTextField(10);
	private JTextField textOutput = new JTextField(10);
	
	private JButton countLetters;
	private JButton reverseLetters;
	private JButton removeDuplicates;
	
	public MyFrame(String title) {
		super(title);
		initializeWindow();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		
		JPanel buttonPanel = drawButtonPanel();
		JPanel textPanel = drawTextPanel();
		
		mainPanel.add(buttonPanel);
		mainPanel.add(textPanel);
		
		getContentPane().add(mainPanel);
	}
	
	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}
	
	private JPanel drawTextPanel() {
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		
		JPanel inputPanel = createTextBox("Input", textInput);
		textPanel.add(inputPanel, BorderLayout.NORTH);
		
		JPanel outputPanel = createTextBox("Output", textOutput);
		textPanel.add(outputPanel, BorderLayout.SOUTH);
		
		return textPanel;
	}

	private JPanel createTextBox(String labelString, JTextField textfield) {
		JPanel panel = new JPanel();
		JLabel label = new JLabel(labelString);
		label.setFont(makeSmallFont(label.getFont()));

		panel.setLayout(new BorderLayout());
		panel.add(textfield, BorderLayout.SOUTH);
		panel.add(label, BorderLayout.NORTH);
		
		return panel;
	}

	private JPanel drawButtonPanel() {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		
		countLetters = new JButton("Count Letters");
		countLetters.addActionListener(new CountLettersListener());
		buttonPanel.add(countLetters, BorderLayout.NORTH);
		
		reverseLetters = new JButton("Reverse Letters");
		reverseLetters.addActionListener(new ReverseLettersListener());
		buttonPanel.add(reverseLetters, BorderLayout.CENTER);
		
		removeDuplicates = new JButton("Remove Duplicates");
		removeDuplicates.addActionListener(new RemoveDuplicatesListener());
		buttonPanel.add(removeDuplicates, BorderLayout.SOUTH);
		
		return buttonPanel;
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerFrameOnDesktop(this);
		setSize(450, 250);
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
				MyFrame mf = new MyFrame("String Utility");
				mf.setVisible(true);
			}
		});

	}
	
	class CountLettersListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String input = textInput.getText();
			textOutput.setText(""+input.length());
		}
	}
	
	class ReverseLettersListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String input = textInput.getText();
			textOutput.setText(new StringBuilder(input).reverse().toString());
		}
	}
	
	class RemoveDuplicatesListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String input = textInput.getText();
			textOutput.setText(removeDuplicates(input));
		}
	}
	
	private String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

}
