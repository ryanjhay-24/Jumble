import java.util.Scanner;

public class numberCheckerinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;


        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter number for " + (i) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println("The number at index " + (i) + " is: " + arr[i]);
            

            if (arr[i] > biggest){
                biggest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }

            sum += arr[i];
        }
        System.out.println("The biggest number is: " + biggest);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The sum of all the numbers is: " + sum);
        System.out.println("The average of all the numbers is: " + (sum / (double) size));
    }
    
}
