import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args){
        StringBuilder string = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word to check if its a palendrome: ");
        String word = sc.nextLine();

        string.append(word);
        string.reverse();

        String reversedString = string.toString();

        if (word.equals(reversedString)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
