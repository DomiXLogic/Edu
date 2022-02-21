package General;

public class SmartValidation {

	public static void main(String[] args) {
		
		int a = 10 ; 
		int b = 20 ;
		int c = 30 ; 
		int d = 40 ;
		
		boolean ok  = true;
		
		ok = b > a && ok;
		ok = d > c && ok;

		
		if(ok)
		System.out.println(ok);		

	}

}
