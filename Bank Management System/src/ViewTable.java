import java.sql.*;
import javax.swing.*;
public class ViewTable 
{
  public ViewTable()
  {
    try 
  {
     
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_Login", "root", "Het@uda123");
    
      String query = "SELECT * FROM tbl_register";
    
      Statement stm = con.createStatement();
      ResultSet res = stm.executeQuery(query);
    
      String columns[] = { "Full Name", "Father's Name", "DOB", "Email Address", "Gender","Address","phone no","Account Type","Account no" };
      String data[][] = new String[15][9];
    
      int i = 0;
      while (res.next()) {
        String Fullname = res.getString("FullName");
        String Father = res.getString("Father's name");
        String DOB = res.getString("DOB");
        String Email = res.getString("Email Address");
        String Gender = res.getString("Gender");
        String Address = res.getString("Address");
        String phone = res.getString("Phone_no");
        String Acc = res.getString("Account type");
        String Accno = res.getString("Account_no");

        data[i][0] = Fullname + "";
        data[i][1] = Father;
        data[i][2] = DOB;
        data[i][3] = Email;
        data[i][4] = Gender;
        data[i][5] = Address;
        data[i][6] = phone;
        data[i][7] = Acc;
        data[i][8] = Accno;

        i++;
      }
    
      JTable table = new JTable(data,columns);
      table.setBounds(20,20,1500,900);
      table.getColumnModel().getColumn(3).setPreferredWidth(130);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("Details of Registered Account Holders");
      f.add(pane);
      f.setSize(1500, 800);
      f.setVisible(true);
    
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }

public static void main(String[] args) {
	new ViewTable();
	
}
}
