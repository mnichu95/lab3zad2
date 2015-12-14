package lab3zad2;

import java.util.Random;

public class RandomGenerator {
	Random generator = new Random();

	private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyz";
	private static final int RANDOM_STRING_LENGTH = 3;

	private int getRandomNumber() {
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(CHAR_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}

	public String generateRandomString() {

		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
			int number = getRandomNumber();
			char ch = CHAR_LIST.charAt(number);
			randStr.append(ch);
		}
		return randStr.toString();
	}
}
