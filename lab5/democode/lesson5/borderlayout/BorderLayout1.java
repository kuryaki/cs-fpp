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

public class BorderLayout1 extends JFrame {
	public BorderLayout1() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		JButton west = new JButton("West");
		JButton east = new JButton("East");
		JButton center = new JButton("Center");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		mainPanel.add(west, BorderLayout.WEST);
		mainPanel.add(east, BorderLayout.EAST);
		mainPanel.add(center, BorderLayout.CENTER);
		mainPanel.add(north, BorderLayout.NORTH);
		mainPanel.add(south, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
		pack();
	}
	
	private void initializeWindow() {
		setTitle("Border Layout");		
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
		BorderLayout1 ex = new BorderLayout1();
		//mf.pack();
		ex.setVisible(true);
	}
}

