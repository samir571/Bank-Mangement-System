import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.*;
public class FormFillUpPage {
JFrame frame;
JLabel lbl_title,lbl_name,lbl_fathername,lbl_DOB,lbl_gender,lbl_acc,lbl_email,lbl_address,lbl_phone;
JTextField txt_Fname,txt_father,txt_email,txt_address,txt_phone;
JRadioButton M,F,S,C;
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
	lbl_title.setBounds(220,5,300,25);
	lbl_title.setForeground(Color.blue);
	frame.add(lbl_title);
	
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
	
	
	// check Box of terms and conditions
	check = new JCheckBox("Note:- I hereby declare that above given information are correct and I accept all the terms and conditions.");
	check.setFont(fon3);
	check.setBounds(20,740,640,15);
	frame.add(check);
	
	

	
	


	
	
	frame.setSize(700,800);
	frame.setLayout(null);
	frame.setVisible(true);
}
public static void main(String args[]) {
	new FormFillUpPage();
}
}
