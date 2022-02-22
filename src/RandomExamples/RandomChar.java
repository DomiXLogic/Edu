package RandomExamples;

import java.util.Random;

public class RandomChar {
    public static void main(String[] args) {
        Random random = new Random();

        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println("Generated Random Character: " + randomizedCharacter);

    }

}