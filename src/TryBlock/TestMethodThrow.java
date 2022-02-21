package TryBlock;

import java.io.*;  

class TestMethodThrow{  
   public static void main(String args[])throws IOException{//declare exception  
	
		  System.out.println("normal flow...");
		  method();
  }  
   
   static void method()throws IOException{  
	   System.out.println("device operation performed");  
	  }  

}  