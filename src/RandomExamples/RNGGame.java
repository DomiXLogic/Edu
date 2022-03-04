package RandomExamples;

import java.util.Random;
import java.util.Scanner;


public class RNGGame {

	static Random rng = new  Random(); 
	static boolean success = false; 
	static int userGuess;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		run();

	}
	
	public static void run() {
	    logic(3);
	    if(!success)
	    	System.out.println("You lose.. see you next time");
	}
	
	public static int getRandom() {
		return rng.nextInt(10);
	}
	
	public static void logic(int timesToRun) {
		int rn  = getRandom();
		System.out.println(rn);
		System.out.println("I have a number (0 - 10) in memory.. Which one do you believe it is..? ");
		
		for(int i = 0 ;  i < timesToRun ; i++) {
			userGuess = sc.nextInt();
			if(userGuess==rn) {
				System.out.println("WoW you got me!! Conratz ");
				success = true;
				break;
			}
				else {
					System.out.println("Nop.. You have " + (timesToRun - i -1 ) + " times to guess my number");
					
				}
			}
		}
	}


