package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginMain {
	public boolean checklogin(String id, String pw){
		boolean result = false;
	 try {
         Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_Login", "root", "Het@uda123");

         PreparedStatement st = (PreparedStatement) connection
             .prepareStatement("Select username, password from tbl_login where username=? and password=?");

         st.setString(1, id);
         st.setString(2, pw);
         ResultSet rs = st.executeQuery();
         rs.next();
         String username = rs.getString(1);
         String password = rs.getString(2);
         if (username.equals(id) && password.equals(pw)) {
             System.out.println("username and password matched login test passed");
        	 result = true;
         }
 
	 }
	 catch (SQLException sqlException) {
         System.out.println("username and password donot match login test failed");
     }
	return result;	
	}

}
