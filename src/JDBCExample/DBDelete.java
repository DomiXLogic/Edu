package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDelete {
   static final String DB_URL = "jdbc:mysql://localhost/student_tracker?characterEncoding=utf8";
   static final String USER = "demo";
   static final String PASS = "demo";
   public static void main(String[] args) throws ClassNotFoundException {
      try
       {
    	  Class.forName("com.mysql.jdbc.Driver");  
    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          PreparedStatement myStmt = null;
          String sql = "delete from student where id=?";
			myStmt = conn.prepareStatement(sql);
			// set params
			myStmt.setInt(1, 4);
			
			myStmt.execute();
       } catch (SQLException e) {
         e.printStackTrace();
      } finally {
   	   System.out.println("The deletion has been executed successfully ");
     }
   }
  }

