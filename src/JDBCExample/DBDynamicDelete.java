package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBDynamicDelete {
   static final String DB_URL = "jdbc:mysql://localhost/student_tracker?characterEncoding=utf8";
   static final String USER = "demo";
   static final String PASS = "demo";
   public static void main(String[] args) throws ClassNotFoundException {
	   Scanner sc = new Scanner (System.in);
	   try
       {
    	  Class.forName("com.mysql.jdbc.Driver");  
    	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
          PreparedStatement myStmt = null;
          String sql = "delete from student"; 
            System.out.println("Give me the ID you want to delete : ");
            int ui = sc.nextInt(); 
            if(ui==6) {
            	System.out.println("This user can not be deleted. ");
            }
            else {
            	sql = sql + " where id=?";  
            	myStmt = conn.prepareStatement(sql);
			    myStmt.setInt(1, ui);
			    myStmt.execute();
			    sc.close();
            }	
       } catch (SQLException e) {
         e.printStackTrace();
      }  
     }
   }


