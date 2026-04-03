package numberGuessingGame;

import java.util.Random;
public class numberGenerator {
    public int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound; // generates a number between lowerBound and upperBound
        return randomNumber;
    }
}
