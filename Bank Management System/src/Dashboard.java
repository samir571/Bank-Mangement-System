import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Dashboard implements ActionListener {
JFrame frame;
JLabel gif,background,logo,check,view;
JButton btn_new, btn_details;
public Dashboard() {
	frame = new JFrame("NMB BANK LTD");
	Color color1 = new Color(0,204,210);
	
	// Placing Background Image
	Icon bg = new ImageIcon(this.getClass().getResource("background.jpg"));
	JLabel background = new JLabel(bg);
	background.setBounds(10, 0, 1370, 800); 
	frame.getContentPane().add(background);
	
	
	// Inserting GIF image
	Icon imgIcon = new ImageIcon(this.getClass().getResource("welcome3.gif"));
	JLabel gif = new JLabel(imgIcon);
	gif.setBounds(160, 160, 1048, 300); 
	background.add(gif);
	
	// Inserting logo
		Icon imgIcon1 = new ImageIcon(this.getClass().getResource("bank.png"));
		JLabel logo = new JLabel(imgIcon1);
		logo.setBounds(600, 10, 200, 200); 
		background.add(logo);
	
	btn_new = new JButton("Open New Account");
	btn_new.setBounds(180,500,200,80);
	btn_new.setBackground(color1);
	btn_new.setFont(new Font("Serif", Font.PLAIN, 20));
	btn_new.addActionListener(this);
	background.add(btn_new);
	
	Icon imgIcon2 = new ImageIcon(this.getClass().getResource("checklist.png"));
	JLabel check = new JLabel(imgIcon2);
	check.setBounds(120, 520, 60, 60); 
	background.add(check);
	 
	
	btn_details = new JButton("View Accounts Details");
	btn_details.setBounds(500,500,250,80);
	btn_details.setBackground(color1);
	btn_details.setFont(new Font("Serif", Font.PLAIN, 20));
	btn_details.addActionListener(this);
	background.add(btn_details);
	
	Icon imgIcon3 = new ImageIcon(this.getClass().getResource("view.png"));
	JLabel view = new JLabel(imgIcon3);
	view.setBounds(440, 520, 60, 60); 
	background.add(view);
	
	
	
	frame.setSize(1400,800);
	frame.setLayout(null);
	frame.setVisible(true);
}

public static void main(String args[]) {
	new Dashboard();
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == btn_new) {
		new FormFillUpPage();
		
	}
	
	if(e.getSource()== btn_details) {
		new ViewTable();
	}
	
}
}
