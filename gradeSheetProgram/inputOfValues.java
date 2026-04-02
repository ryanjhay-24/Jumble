package gradeSheetProgram;

//class file to accept user input for the grade sheet program
import java.util.Scanner;
public class inputOfValues {
    //initialization of variables to store user input and calculated values
    String name;
    int sub1;
    int sub2;
    int sub3;
    int totalMarks;
    double averageMarks;
    String grade;
    //putting it in the parameter to be able to call it in the main method and pass the values to the calculation class
    public inputOfValues(String name, int sub1, int sub2, int sub3, String grade, int totalMarks, double averageMarks) {

        //user data input using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        name = sc.nextLine();
        System.out.println("Enter the marks obtained in subject 1: ");
        sub1 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 2: ");
        sub2 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 3: ");
        sub3 = sc.nextInt();
        sc.close();
        //variables can be called by calling the object and the variable which can be passed along the other classes
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.grade = grade;
        this.totalMarks = totalMarks;
        this.averageMarks = averageMarks;
    }
}


