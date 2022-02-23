package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSelect {
   static final String DB_URL = "jdbc:mysql://localhost/student_tracker?characterEncoding=utf8";
   static final String USER = "demo";
   static final String PASS = "demo";
   public static void main(String[] args) throws ClassNotFoundException {
      try
       {
    	  Class.forName("com.mysql.jdbc.Driver");  
    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          Statement stmt = conn.createStatement();
          String sql = "SELECT * FROM student";
		  ResultSet rs = stmt.executeQuery(sql);
			
			String user = "";
			System.out.println("Users \n----------");
			while (rs.next()) {
				user = rs.getString("first_name");
				System.out.println(user);
				}
       } catch (SQLException e) {
         e.printStackTrace();
       } 
   }
  }
 