package General;
import java.util.Scanner;

public class PrintingAValueExampel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Give a number : ");
		int x = sc.nextInt();
		for(int i = 0; i<=10 ; i = i+1)
		{
			System.out.println("The value of i is : " +x);
		}
		sc.close();
	}

}
