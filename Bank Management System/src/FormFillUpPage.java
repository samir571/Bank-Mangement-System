import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;

import javax.swing.*;
public class FormFillUpPage implements ActionListener {
JFrame frame;
JLabel lbl_title,lbl_name,lbl_fathername,lbl_DOB,lbl_gender,lbl_acc,lbl_email,lbl_address,lbl_phone,lbl_accnum,lbl_accnum1,lbl_year;
JTextField txt_Fname,txt_father,txt_email,txt_address,txt_phone,txt_year;
JRadioButton M,F,S,C;
JButton btn_register;
JCheckBox check;
JComboBox Day,month,year;
String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String[] months = {"January","February","March","April","May","June","July","August","september","October","November","December"};

public FormFillUpPage() {
	frame = new JFrame("New account opening Form");
	Color color1 = new Color(0,204,210);
	Font fon1 = new Font("arial",Font.BOLD,19);
	Font fon2 = new Font("arial",Font.PLAIN,15);
	Font fon3 = new Font("arial",Font.ITALIC,13);


	frame.getContentPane().setBackground(color1);
	lbl_title = new JLabel("New Acccount Application Form");
	lbl_title.setFont(new Font("TimesRoman", Font.BOLD,20));
	lbl_title.setBounds(220,30,300,25);
	lbl_title.setForeground(Color.blue);
	frame.add(lbl_title);
	
	JLabel logo = new JLabel("");
	ImageIcon img2 = new ImageIcon(this.getClass().getResource("/bank1.png"));
	logo.setIcon(img2);
	logo.setBounds(140, 10, 70, 65);
	frame.getContentPane().add(logo);
	
	// fullname label
	lbl_name = new JLabel("Full Name:");
	lbl_name.setBounds(30,80,100,50);
	lbl_name.setFont(fon1);
	frame.add(lbl_name);
	
	// fullname textfield
	txt_Fname = new JTextField();
	txt_Fname.setBounds(175,85,200,35);
	txt_Fname.setFont(fon2);
	frame.add(txt_Fname);
	
	// father's name label
	lbl_fathername = new JLabel("Father's Name:");
	lbl_fathername.setBounds(30,150,150,50);
	lbl_fathername.setFont(fon1);
	frame.add(lbl_fathername);
	
	// Father's Name textfield
	txt_father = new JTextField();
	txt_father.setBounds(175,155,200,35);
	txt_father.setFont(fon2);
	frame.add(txt_father);
	
	//Date of Birth Label
	lbl_DOB = new JLabel("Date of Birth:");
	lbl_DOB.setBounds(30,230,180,50);
	lbl_DOB.setFont(fon1);
	frame.add(lbl_DOB);
	
	//ComboBox of DOB
	Day = new JComboBox(date);
	Day.setBounds(220,245,60,20);
	frame.add(Day);
	JLabel lbl_day = new JLabel("Day");
	lbl_day.setFont(fon2);
	lbl_day.setBounds(185,246,40,20);
	frame.add(lbl_day);
	
	month = new JComboBox(months);
	month.setBounds(380,245,90,20);
	frame.add(month);
	JLabel lbl_month = new JLabel("month");
	lbl_month.setFont(fon2);
	lbl_month.setBounds(330,246,60,20);
	frame.add(lbl_month);
	
	lbl_year = new JLabel("Year:");
	lbl_year.setFont(fon2);
	lbl_year.setBounds(500,245,60,20);
	frame.add(lbl_year);
	
	txt_year = new JTextField();
	txt_year.setFont(fon2);
	txt_year.setBounds(550,245,60,20);
	frame.add(txt_year);
	
	
	
	
	// Email address Label
	lbl_email = new JLabel("Email Address:");
	lbl_email.setBounds(30,330,180,50);
	lbl_email.setFont(fon1);
	frame.add(lbl_email);
	
	
	// Email address textfield
	txt_email = new JTextField();
	txt_email.setBounds(175,335,230,35);
	txt_email.setFont(fon2);
	frame.add(txt_email);
	
	
	// Gender Label
	lbl_gender = new JLabel("Gender:");
	lbl_gender.setBounds(30,395,180,50);
	lbl_gender.setFont(fon1);
	frame.add(lbl_gender);
	
	// Gender RadioButton
	M = new JRadioButton("Male");
	F = new JRadioButton("Female");
	F.setBounds(230,410,100,20);
	M.setBounds(130,410,100,20);
	M.setFont(fon1);
	M.setBackground(color1);
	F.setFont(fon1);
	F.setBackground(color1);
	ButtonGroup bg = new ButtonGroup();
	bg.add(F);
	bg.add(M);
	frame.add(M);
	frame.add(F);
	
	//Adress Label
	lbl_address = new JLabel("Address:");
	lbl_address.setBounds(30,460,180,50);
	lbl_address.setFont(fon1);
	frame.add(lbl_address);
	
	//Address Textfield
	txt_address = new JTextField();
	txt_address.setBounds(175,465,200,35);
	txt_address.setFont(fon2);
	frame.add(txt_address);
	
	
	// Phone num Label
	lbl_phone = new JLabel("Phone no:");
	lbl_phone.setBounds(30,535,180,50);
	lbl_phone.setFont(fon1);
	frame.add(lbl_phone);
	
	
	// phone num TextField
	txt_phone = new JTextField();
	txt_phone.setBounds(175,540,200,35);
	txt_phone.setFont(fon2);
	frame.add(txt_phone);
	
	
	//Account type Label
	lbl_acc = new JLabel("Account Type:");
	lbl_acc.setBounds(30,600,180,50);
	lbl_acc.setFont(fon1);
	frame.add(lbl_acc);
	
	//Account type RadioButton
	S = new JRadioButton("Saving Account");
	C = new JRadioButton("Current Account");
	S.setBounds(190,615,190,25);
	C.setBounds(390,615,190,25);
	S.setFont(fon1);
	S.setBackground(color1);
	C.setFont(fon1);
	C.setBackground(color1);
	ButtonGroup bg1 = new ButtonGroup();
	bg1.add(S);
	bg1.add(C);
	frame.add(S);
	frame.add(C);
	
	lbl_accnum = new JLabel("Account no:");
	lbl_accnum.setFont(fon1);
	lbl_accnum.setBounds(30,670,150,50);
	frame.add(lbl_accnum);
	
	lbl_accnum1 = new JLabel("XXXX-XXXX-XXXX-XXXX");
	lbl_accnum1.setFont(fon1);
	lbl_accnum1.setBounds(190,670,250,50);
	frame.add(lbl_accnum1);
	JLabel info = new JLabel("(Will automatically register 16 digit num)");
	info.setFont(fon3);
	info.setBounds(420,685,300,20);
	frame.add(info);

	
	
	// check Box of terms and conditions
	check = new JCheckBox("Note:- I hereby declare that above given information are correct and I accept all the terms and conditions.");
	check.setFont(fon3);
	check.setBounds(20,725,640,15);
	frame.add(check);
	
	btn_register = new JButton("Register");
	btn_register.setFont(fon2);
	btn_register.setBounds(230,750,120,40);
	btn_register.addActionListener(this);
	frame.add(btn_register);
	
	

	frame.setSize(700,860);
	frame.setLayout(null);
	frame.setVisible(true);
}
public static void main(String args[]) {
	new FormFillUpPage();
}
@Override
public void actionPerformed(ActionEvent e) {
	final String fullname = txt_Fname.getText();
	String father = txt_father.getText();
	
	String value = (String)Day.getSelectedItem(); // casting
	String Day1 = Day.getSelectedItem().toString();
	
	String value1 = (String)month.getSelectedItem();
	String month1 = month.getSelectedItem().toString();
	
	String year1 = txt_year.getText();
	
	String DOB = Day1 + " " + month1 + " " + year1;
	
	String Email = txt_email.getText();
	
	String gender = "";
	if(M.isSelected()){ 
        gender = "Male";
    }else if(F.isSelected()){ 
        gender = "Female";
    }
	
	String address = txt_address.getText();
	String phone = txt_phone.getText();
	
	
	String acctype = "";
    if(S.isSelected()){ 
        acctype = "Saving Account";
    }
    else if(C.isSelected()){ 
        acctype = "Current Account";
    }
    
    Random ran = new Random();
    long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
    final String cardno = "" + Math.abs(first7);
    
	if(e.getSource() == btn_register);{
		if(check.isSelected()) {
		    
	        try {
	            
	            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_Login", "root", "Het@uda123");

	            PreparedStatement st = (PreparedStatement) con
	                .prepareStatement("Insert into tbl_register values (?,?,?,?,?,?,?,?,?)");

	            st.setString(1, fullname);
	            st.setString(2, father);
	            st.setString(3, DOB);
	            st.setString(4, Email);
	            st.setString(5, gender);
	            st.setString(6, address);
	            st.setString(7, phone);
	            st.setString(8, acctype);
	            st.setString(9, cardno);


	            st.executeUpdate();
	            JOptionPane.showMessageDialog(frame, "Account opened with account num" + " "+ cardno +" and registered succefully!");
	            check.setSelected(false);
	            txt_Fname.setText("");
	            txt_father.setText("");
	            txt_email.setText("");
	            txt_address.setText("");
	            txt_phone.setText("");



	            

	        } catch (SQLException sqlException) {
	            sqlException.printStackTrace();
	        }

	    }
		else {
            JOptionPane.showMessageDialog(frame, "please check Customer terms and conditions!!!");

		}
		
	}
	
	
}
}
