package RandomExamples;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadRandomExample {
	
	public static int rand(int min, int max)
      {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range");
        }
         return ThreadLocalRandom.current().nextInt(min, max + 1);
      }
   
	public static void main(String[] args)
      {
        int min = 1, max = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(rand(min, max));
        }
      }
}
