import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int[] marks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

       
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averagePercentage = ((double)totalMarks / numberOfSubjects);

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80 && averagePercentage < 90) {
            grade = "B";
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            grade = "C";
        } else if (averagePercentage >= 60 && averagePercentage < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " +averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
