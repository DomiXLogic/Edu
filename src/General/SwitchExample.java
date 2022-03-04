package General;

import java.util.Scanner;

public class SwitchExample {

	static String in = "";
	static boolean answer = true;

	public static void main(String[] args) {
		start();
	}

	public static void start() {

		Scanner sc = new Scanner(System.in);

		while (answer) {

			System.out.println("Τι βαθμό πήρες?");
			int userIn = sc.nextInt();

			switch (userIn / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Κόπηκες");
				break;
			case 5:
			case 6:
			case 7:
				System.out.println("Πέρασες");
				break;
			case 8:
			case 9:
				System.out.println("Αριστα");
				break;
			default:
				System.out.println("Δώσε τιμή από 0 - 99");
				break;
			}

			System.out.println("θέλεις να συνεχίσεις (y/n) : ");
			in = sc.next();
			answer = continueAsking();

		} // while
		sc.close();

	}

	public static boolean continueAsking() {
		if (in.equals("y")) {
			return true;
		} else {
			System.out.println("Καλή συνέχεια...!!!");
			return false;
		}
	}
}
