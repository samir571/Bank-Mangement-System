import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

public class DeleteRecord implements ActionListener {
JFrame frame;
JLabel lbl_background,lbl_heading;
static JTextField search;
JButton btn_delete;

public DeleteRecord(){
	frame = new JFrame("Search and Delete record from database");
	Font fon = new Font("arial",Font.PLAIN,25);
	// Background Image
	Icon bg = new ImageIcon(this.getClass().getResource("delete.jpg"));
	lbl_background = new JLabel(bg);
	lbl_background.setBounds(0,0,700,600); 
	frame.getContentPane().add(lbl_background);
	
	// Label Title
	lbl_heading = new JLabel("Delete account records");
	lbl_heading.setForeground(Color.red);
	lbl_heading.setFont(fon);
	lbl_heading.setBounds(200,10,350,40);
	lbl_background.add(lbl_heading);
	
	
	//Textfield for search
	search = new JTextField();
	search.setBounds(170,60,350,60);
	search.setFont(fon);
	lbl_background.add(search);
	
	//delete button
	btn_delete = new JButton("Delete");
	btn_delete.setFont(fon);
	btn_delete.setBounds(190,145,310,110);
	lbl_background.add(btn_delete);
	btn_delete.addActionListener(this);
	
	
	
	frame.setSize(700,600);
	frame.setLayout(null);
	frame.setVisible(true);
	
}
public static void main(String args[]) {
	new DeleteRecord();
	

}
@Override
public void actionPerformed(ActionEvent e) {
	final String acc_no = search.getText();
	if (e.getSource() == btn_delete) {
		try {
			int result = JOptionPane.showConfirmDialog(frame,"Sure? You want to delete record of" + " " + acc_no, "Deletion confirmation!!!",
		               JOptionPane.YES_NO_OPTION,
		               JOptionPane.QUESTION_MESSAGE);
		            if(result == JOptionPane.YES_OPTION){

		            
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_Login", "root", "Het@uda123");



			PreparedStatement st = (PreparedStatement) connection
			.prepareStatement("delete from tbl_register where Account_no = ?");
			st.setString(1, acc_no);
			st.executeUpdate();
			
			JOptionPane.showMessageDialog(frame, "record deleted successfully");
		           
		         }
		            else {
		            	frame.setVisible(true);
		            	search.setText(null);
		            }
		}
	        
	
		catch (SQLException sqlException) {
	        sqlException.printStackTrace();
	    }
		
		
		
	}
	
}

}
