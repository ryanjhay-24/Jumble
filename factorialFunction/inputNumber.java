package factorialFunction;
import java.util.Scanner;

//class file that accepts user input
public class inputNumber {
    //main method to run the program
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        //calls in the function calculateFactorial from calculation.java class by passing the integer "num"
        int factorial = calculation.calculateFactorial(num);

        //prints the result to the console
        System.out.println("=" + factorial);
        System.out.println("The factorial of " + num + " is: " + factorial);

    }
    
}
