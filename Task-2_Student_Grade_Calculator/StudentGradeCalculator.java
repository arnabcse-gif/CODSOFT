import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of subjects:");
        int n = sc.nextInt();

        if(n<=0) {
            System.out.println("Invalid number of subjects.");
            return;
        }
        
        int totalMarks = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter marks for subject : " + i + "(out of 100):");
            int marks = sc.nextInt();
            if(marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                i--; // repeat this iteration
                continue;
            }
            totalMarks += marks;
        }
    

    double percentage = (double) totalMarks / n;
    String grade;

    if(percentage >= 90) {
        grade = "O";
    } else if(percentage >= 80) {
        grade = "E";
    } else if(percentage >= 70) {
        grade = "A";
    } else if(percentage >= 60) {
        grade = "B";
    } else if(percentage >= 50) {
        grade = "C";        
    } else if(percentage >= 40) {
        grade = "D";      
    } else {
        grade = "F";
    }
    System.out.println("\n----- Result -----");
    System.out.println("Total Marks: " + totalMarks);
    System.out.printf("Percentage: %.2f%%\n", percentage);
    System.out.println("Grade: " + grade);

    sc.close();
    }
}   

