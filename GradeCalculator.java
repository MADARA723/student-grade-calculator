import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Student Grade Calculator!");

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        
        int[] marks = new int[numSubjects];

        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks (out of 100) for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        
        int totalMarks =0;
       
        for (int mark : marks) {
            totalMarks += mark;
        }

        
        double averagePercentage = totalMarks/numSubjects;

        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        
        String grade ;
         if (averagePercentage >= 90) {
            grade= "A";
        } else if (averagePercentage >= 80) {
            grade= "B";
        } else if (averagePercentage >= 70) {
            grade= "C";
        } else if (averagePercentage >= 60) {
            grade ="D";
        } else {
            grade= "F";
        }
        System.out.println("Your Grade: " + grade);

        scanner.close();
    }
}
