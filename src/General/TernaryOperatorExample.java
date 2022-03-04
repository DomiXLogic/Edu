package General;

import java.util.Scanner;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Give me your name :");
		String uName = sc.next();

		System.out.println("Give the character you want to search for :");
		String searchInput =  sc.next();
		
	//	String msg = uName.contains(searchInput) ? "Yes it is contained " : "No it not contained" ;
		System.out.println( uName.contains(searchInput) ? "Yes it is contained " : "No it not contained");
		

	//	uName.contains(searchInput) ? System.out.println("Yes is contained in sentence") : System.out.println("Nooooo");
	}

}
