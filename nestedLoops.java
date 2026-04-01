import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pyramid: ");
        int rows = sc.nextInt();
        //outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            //prints the spaces required for the pyramid    
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            //prints the stars for the pyramid
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        
        }
    }
}
