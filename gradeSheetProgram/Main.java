package gradeSheetProgram;
//main class to run the program and call the functions from the other classes
public class Main {
    public static void main(String[] args) {
        //creating an object of the inputOfValues class to call the constructor and get user input
        inputOfValues input = new inputOfValues(null, 0, 0, 0, null, 0, 0);
        //creating an object of the calculationOfGrade class to call the calculateGrade function and pass the input object to it
        calculationOfGrade calculation = new calculationOfGrade();
        calculation.calculateGrade(input);
        //creating an object of the output class to call the Output function and pass the input object to it to display the results
        output output = new output();
        output.Output(input);
    }
    
}