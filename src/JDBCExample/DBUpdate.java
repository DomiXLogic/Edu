package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUpdate {
   static final String DB_URL = "jdbc:mysql://localhost/student_tracker?characterEncoding=utf8";
   static final String USER = "demo";
   static final String PASS = "demo";
   public static void main(String[] args) throws ClassNotFoundException {
      try
       {
    	  Class.forName("com.mysql.jdbc.Driver");  
    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          PreparedStatement myStmt = null;
          String sql = "update student  set first_name=?, last_name=?, email=?"
					 + " where id=?";
		myStmt = conn.prepareStatement(sql);
		// set params
		myStmt.setString(1, "EfkaUser");
		myStmt.setString(2, "DBTest");
		myStmt.setString(3, "EfkaUser@dbTest.gr");
		myStmt.setInt(4, 17);	
		
		myStmt.execute();
       } catch (SQLException e) {
         e.printStackTrace();
      } finally {
   	   System.out.println("The update has been executed successfully ");
     }
   }
  }
 
