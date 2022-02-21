package General;

import java.util.Scanner;

public class MainTest {

	public static void main(String args[ ]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Give me your grade : ");
		String grade = sc.next();	
		String chech=  grade.toUpperCase();
		
		switch(chech){
		    case "A":
				System.out.println("Congratulations! Your marks is "
						+ "in the range 81 - 100");
				break;
		    case "B":
				System.out.println("Your marks is in the range 51 - 81 ");
				break;
			case "C":
				System.out.println("Your marks is in the range 0 - 50");
				break;
			default:
				System.out.println("Error!");
				System.out.println("The grade you entered is not valid!");
		}

  }// class

} //class