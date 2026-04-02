package gradeSheetProgram;

public class calculationOfGrade {
    //inside the parameter is the function name of input and the object
    public void calculateGrade(inputOfValues input) {
        //calculates the total marks of each subjects
        input.totalMarks = input.sub1 + input.sub2 + input.sub3;
        //calculates the average marks by dividing the total marks by the number of subjects which is 3
        input.averageMarks = input.totalMarks / 3.0;
        //conditional statement to determine the grade
        if (input.averageMarks >= 95) {
            input.grade = "A+ Outstanding";
        } else if (input.averageMarks >= 90) {
            input.grade = "A Excellent";
        } else if (input.averageMarks >= 85) {
            input.  grade = "B Satisfactory";
        } else if (input.averageMarks >= 75) {
            input.grade = "C passed";
        } else if (input.averageMarks >= 65) {
            input.grade = "D barely passed";
        } else {
            input.grade = "F you failed";
        }
    }
    
}
