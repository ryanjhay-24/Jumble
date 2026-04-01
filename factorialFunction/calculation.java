package factorialFunction;
//class file for calculating the factorial of a number
public class calculation {
    //accepts the data passed from inputNumber.java
    public static int calculateFactorial(int num) {
        int factorial = 1;
        //calculates the factorial like this
        //i is equals to 1, as long as i is lest than or equal to num, i will be incremented by 1
        for(int i = 1; i<= num; i++){
            factorial *=i;
            System.out.print(i + "*");
        }
        
        //returns the value of factorial to the inputNumber.java class
        return factorial;   
    }
}
