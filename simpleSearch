import java.util.Scanner;

public class simpleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //initialize the array and target element
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //entero the elements of the array and the target element
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //enters the target element to search for in the array
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        boolean found = false;
        //searches for the target element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        //boolean to check if the target element is found in the array and prints the result
        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}