import java.util.Scanner;

public class numberCheckerinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        //initializes biggest and smallest to the extreme values so that they can be updated correctly
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;

        //takes input for the array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter number for " + (i) + ": ");
            arr[i] = sc.nextInt();
        }
        //iterates through the array to find the biggest, smallest, sum and average 
        for (int i = 0; i < arr.length; i++){
            System.out.println("The number at index " + (i) + " is: " + arr[i]);
            
            //if statement to check if the current number is bigger than the biggest
            if (arr[i] > biggest){
                biggest = arr[i];
            }
            //if statement to check if the current number is smaller than the smallest
            if (arr[i] < smallest){
                smallest = arr[i];
            }
            //collects all values in the array and adds them to the sum variable
            sum += arr[i];
        }
        //outputs
        System.out.println("The biggest number is: " + biggest);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The sum of all the numbers is: " + sum);
        System.out.println("The average of all the numbers is: " + (sum / (double) size));
    }
    
}
