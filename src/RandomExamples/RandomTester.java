package RandomExamples;

import java.util.Random;

public class RandomTester {
	public static void main(String[] args) {
		someGenerators();
		System.out.println("----------------Seed Change Example----------------------");
		changeSeed();
	}
	public static void someGenerators() {
		int max = 1000;
		int min = 990;
		Random random = new Random();
		System.out.println("Random boolean : "+random.nextBoolean());
		System.out.println("Random Double : "+random.nextDouble());
		System.out.println("Random Float : "+random.nextFloat());
		System.out.println("Random Int : "+random.nextInt());
		System.out.println("Random Int (0-15) : "+random.nextInt(15));
		System.out.println("Random Int in range (990-1000) : "+random.nextInt(max-min)+min);
	}
	public static void changeSeed() {
		Random rnd = new Random(20);
		System.out.println("Starting Seed is 20");
		for (int i = 0; i < 3; i++) {
			System.out.println(rnd.nextInt(100));
		}
		System.out.println("Seed is 30 to change to sequence");
		rnd.setSeed(30);
		for (int i = 0; i < 3; i++) {
			System.out.println(rnd.nextInt(100));
		}
		System.out.println("Seed is 40 to change to sequence");
		rnd.setSeed(40);
		for (int i = 0; i < 3; i++) {
			System.out.println(rnd.nextInt(100));
		}
		System.out.println("Seed is 20 to produce the previous sequence");
		rnd.setSeed(20);
		for (int i = 0; i < 3; i++) {
			System.out.println(rnd.nextInt(100));
		}
	}
}
