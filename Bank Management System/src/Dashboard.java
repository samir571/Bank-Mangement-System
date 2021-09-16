import java.awt.Color;

import javax.swing.*;
public class Dashboard {
JFrame frame;
JLabel gif,background,logo;
JButton btn_login;
public Dashboard() {
	frame = new JFrame("NMB BANK LTD");
	Color color1 = new Color(0,204,190);
	
	// Placing Background Image
	Icon bg = new ImageIcon(this.getClass().getResource("background.jpg"));
	JLabel background = new JLabel(bg);
	background.setBounds(10, 0, 1370, 800); 
	frame.getContentPane().add(background);
	
	
	// Inserting GIF image
	Icon imgIcon = new ImageIcon(this.getClass().getResource("welcomegif.gif"));
	JLabel gif = new JLabel(imgIcon);
	gif.setBounds(160, 160, 1048, 300); 
	background.add(gif);
	
	// Inserting logo
		Icon imgIcon1 = new ImageIcon(this.getClass().getResource("bank.png"));
		JLabel logo = new JLabel(imgIcon1);
		logo.setBounds(620, 10, 200, 200); 
		background.add(logo);
	
	btn_login = new JButton("Login in");
	btn_login.setBounds(100,500,150,80);
	btn_login.setBackground(color1);
	background.add(btn_login);
	
	
	
	frame.setSize(1400,800);
	frame.setLayout(null);
	frame.setVisible(true);
}

public static void main(String args[]) {
	new Dashboard();
}
}
