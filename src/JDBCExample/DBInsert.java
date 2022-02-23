package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBInsert {
   static final String DB_URL = "jdbc:mysql://localhost/student_tracker?characterEncoding=utf8";
   static final String USER = "demo";
   static final String PASS = "demo";
   public static void main(String[] args) throws ClassNotFoundException {
      try
       {
    	  Class.forName("com.mysql.jdbc.Driver");  
    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          PreparedStatement myStmt = null;
          String sql = "insert into student (first_name, last_name, email) values (?,?,?)";
          myStmt = conn.prepareStatement(sql);
			// set params
			myStmt.setString(1, "EFKA");
			myStmt.setString(2, "User2");
			myStmt.setString(3, "efkaUser@efka.gov.gr");
			myStmt.execute();
       } catch (SQLException e) {
         e.printStackTrace();
      } finally {
   	   System.out.println("The insertion has been executed successfully ");
     }
   }
  }
 