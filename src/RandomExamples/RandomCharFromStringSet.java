package RandomExamples;

import java.util.Random;

public class RandomCharFromStringSet {
	public static void main(String[] args) {

        Random random = new Random();

        String setOfCharacters = "abcdefghxyz1234567-/@";

        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);

        System.out.println("Random character from string: " + randomChar);

    }

}