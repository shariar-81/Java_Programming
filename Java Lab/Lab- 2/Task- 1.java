import java.util.Scanner;

public class Gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String grade;
        if (marks >= 80) {
            grade = "A+";
        } else if (marks >= 75 && marks < 80) {
            grade = "A";
        } else if (marks >= 70 && marks < 75) {
            grade = "A-";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else if (marks >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is: " + grade);
        sc.close();
    }
}
