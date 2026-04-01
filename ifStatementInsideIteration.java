import java.util.Scanner;


public class ifStatementInsideIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        //iterates from 1 to the number entered by the user and checks if the number is divisible by 3, 5
        for (int i = 1; i <= num; i++) {
            //if it is divisible by both 3 and 5 it prints fizzbuz
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            //if it is divisible by 5 it prints buzz
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            //if it is divisible by 3 it prints fizz
            else if (i % 3 == 0) {
                System.out.println("fizz");
            }
            //if it is not divisible by either 3 or 5 it prints the number
            else {
                System.out.println(i);
            }

        sc.close();
    }
}
}
