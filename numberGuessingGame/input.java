package numberGuessingGame;

import java.util.Scanner;

public class input {

    //function to get the user input for the number guessing game
    public int[] getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Decide the range of the random number ");
        System.out.println("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();
        System.out.println("Enter the upper bound of the range: ");
        int upperBound = sc.nextInt();
        System.out.print("Enter your guess (between " + lowerBound + " and " + upperBound + "): ");
        int userGuess = sc.nextInt();
        sc.close();

        return new int[]{lowerBound, upperBound, userGuess};

        
    }
    
}
