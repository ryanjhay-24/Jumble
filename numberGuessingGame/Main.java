package numberGuessingGame;

public class Main {

    public static void main(String[] args) {
        // creating objects of the classes
        input userInput = new input();
        numberGenerator generator = new numberGenerator();
        output resultOutput = new output();

        // function to get the user's input (bounds and guess)
        int[] inputs = userInput.getUserInput();
        int lowerBound = inputs[0];
        int upperBound = inputs[1];
        int userGuess = inputs[2];

        // function to generate a random number within the bounds
        int randomNumber = generator.generateRandomNumber(lowerBound, upperBound);

        // function to display the result
        resultOutput.displayResult(userGuess, randomNumber);
    }
    
}
