package General;

public class ForArrayLengthExample {

	public static void main(String[] args) {
		
		int sample[] = new int[10];
		int i;
		// generate an array overrun
		for(i = 0; i < sample.length ; i = i+1)
		{
			System.out.println("The value of i is : " +i);
		}
	}

}
