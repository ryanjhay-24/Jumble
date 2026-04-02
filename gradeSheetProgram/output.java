package gradeSheetProgram;
//output class to display the results of the grade sheet program
public class output {
    //function to display the results of the grade sheet
    //calling the object inputOfValues to be able to access the variables and display them in the console
    public  void Output(inputOfValues input) {

        System.out.println("Grade Sheet:");

        System.out.println("Name: " + input.name);
        System.out.println("Marks in Subject 1: " + input.sub1);
        System.out.println("Marks in Subject 2: " + input.sub2);
        System.out.println("Marks in Subject 3: " + input.sub3);
        System.out.println("-----------------------------");
        System.out.println("Total Marks: " + input.totalMarks);
        System.out.println("Average Marks: " + input.averageMarks);
        System.out.println("Grade: " + input.grade);
        //returns the data to the main method
        return;
    }
    
}
