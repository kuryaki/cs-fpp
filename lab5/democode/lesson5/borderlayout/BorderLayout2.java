package lesson5.borderlayout;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class BorderLayout2 extends JFrame {
	private JPanel westPanel;
	private JPanel eastPanel;
	private JPanel centerPanel;
	private JPanel northPanel;
	private JPanel southPanel;
	public BorderLayout2() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineWestPanel();
		defineEastPanel();
		defineCenterPanel();
		defineNorthPanel();
		defineSouthPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(westPanel, BorderLayout.WEST);
		mainPanel.add(eastPanel, BorderLayout.EAST);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(northPanel, BorderLayout.NORTH);
		mainPanel.add(southPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
		pack();
	}
	private void defineWestPanel() {
		westPanel = new JPanel();
		JButton b = new JButton("West");
		westPanel.add(b);
		
	}
	private void defineEastPanel() {
		eastPanel = new JPanel();
		JButton b = new JButton("East");
		eastPanel.add(b);
		
	}
	private void defineCenterPanel() {
		centerPanel = new JPanel();
		JButton b = new JButton("Center");
		centerPanel.add(b);
		
	}
	private void defineNorthPanel() {
		northPanel = new JPanel();
		JButton b = new JButton("North");
		northPanel.add(b);
		
	}
	private void defineSouthPanel() {
		southPanel = new JPanel();
		JButton b = new JButton("South");
		southPanel.add(b);
		
	}
	
	private void initializeWindow() {
		setTitle("String Utility");		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		centerFrameOnDesktop(this);
		setResizable(false);
	}
	public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize()-2));
    }

	public static void centerFrameOnDesktop(Component f) {
	        final int SHIFT_AMOUNT = 0;
	        Toolkit toolkit = Toolkit.getDefaultToolkit();
	        int height = toolkit.getScreenSize().height;
	        int width  = toolkit.getScreenSize().width;
	        int frameHeight = f.getSize().height;
	        int frameWidth  = f.getSize().width;
	        f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/3);    
	}
	
	public static void main(String[] args){
		BorderLayout2 ex = new BorderLayout2();
		//mf.pack();
		ex.setVisible(true);
	}
}

