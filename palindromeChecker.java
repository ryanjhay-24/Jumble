import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args){
        StringBuilder string = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word to check if its a palendrome: ");
        String word = sc.nextLine();
        //stores the word in to the string builder and then reverses it
        string.append(word);
        string.reverse();
        //putting the reversed string into a new variable reversedString so it can be easily called out for the if statement
        String reversedString = string.toString();
        //if statement to check if it is a palindrome or not
        if (word.equals(reversedString)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
