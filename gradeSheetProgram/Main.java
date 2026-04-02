package gradeSheetProgram;

public class Main {
//main method to run the program
    public static void main(String[] args) {
        //creates an object of the inputOfValues class to accept user input
        inputOfValues input = new inputOfValues(null, 0, 0, 0, null, 0, 0);
        //creates an object of the calculationOfGrade class to calculate the grade
        calculationOfGrade calculation = new calculationOfGrade();
        //creates an object of the output class to display the results
        output output = new output();
        //calls in the calculateGrade method fron calculation class
        calculation.calculateGrade(input);
        //calls in the Output method from output class to display the results
        output.Output(input);
    }
    
}
