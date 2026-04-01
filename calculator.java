import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //first number input
        System.out.println("Enter the first number: ");
        double num = sc.nextInt();
        //second number input
        System.out.println("Enter the second number: ");
        double num2 = sc.nextInt();
        //operation input
        System.out.println("enter the operation you want to perform: \n 1. addition \n 2. subtraction \n 3. multiplication \n 4. division");
        int operation = sc.nextInt();
        //switch case for operation selection that does the mathematical operation based on the user input and outputs the result
        switch (operation) {
            case 1:
                System.out.println("The result of addition is: " + (num + num2));
                break;
            case 2:
                System.out.println("The result of subtraction is: " + (num - num2));
                break;
            case 3:
                System.out.println("The result of multiplication is: " + (num * num2));
                break;
            case 4:
                System.out.println("The result of division is: " + (num / num2));
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        sc.close();
    }
}
