package oops.overloading;
import java.util.Scanner;

class Student {
    Scanner scanner;

    public Student() {
        scanner = new Scanner(System.in);
    }

    // Method to set marks for Semester 1
    void setMarks(int marksSem1) {
        calculateResult(1, marksSem1);
    }

    // Method to set marks for Semester 2
    void setMarks(int marksSem1, int marksSem2) {
        calculateResult(2, marksSem1, marksSem2);
    }

    // Method to set marks for Semester 3
    void setMarks(int marksSem1, int marksSem2, int marksSem3) {
        calculateResult(3, marksSem1, marksSem2, marksSem3);
    }

    // Method to set marks for Semester 4
    void setMarks(int marksSem1, int marksSem2, int marksSem3, int marksSem4) {
        calculateResult(4, marksSem1, marksSem2, marksSem3, marksSem4);
    }

    // Method to calculate result (grade and percentage) for a semester
    private void calculateResult(int semester, int... marks) {
        int totalMarks = 100 * marks.length;
        int totalObtainedMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalObtainedMarks += marks[i];
        }
        double percentage = (double) totalObtainedMarks / totalMarks * 100;
        String grade = calculateGrade(percentage);

        System.out.println("Semester " + semester + " Result:");
        System.out.println("Marks: " + totalObtainedMarks + "/" + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    // Method to calculate grade based on percentage
    private String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class SemMark {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        // Set marks for each semester
        System.out.println("Enter marks for Semester 1:");
        int marksSem1 = scanner.nextInt();
        student.setMarks(marksSem1);

        System.out.println("Enter marks for Semester 1:");
        int marksSem2_1 = scanner.nextInt();
        System.out.println("Enter marks for Semester 2:");
        int marksSem2_2 = scanner.nextInt();
        student.setMarks(marksSem2_1, marksSem2_2);

        System.out.println("Enter marks for Semester 1:");
        int marksSem3_1 = scanner.nextInt();
        System.out.println("Enter marks for Semester 2:");
        int marksSem3_2 = scanner.nextInt();
        System.out.println("Enter marks for Semester 3:");
        int marksSem3_3 = scanner.nextInt();
        student.setMarks(marksSem3_1, marksSem3_2, marksSem3_3);

        System.out.println("Enter marks for Semester 1:");
        int marksSem4_1 = scanner.nextInt();
        System.out.println("Enter marks for Semester 2:");
        int marksSem4_2 = scanner.nextInt();
        System.out.println("Enter marks for Semester 3:");
        int marksSem4_3 = scanner.nextInt();
        System.out.println("Enter marks for Semester 4:");
        int marksSem4_4 = scanner.nextInt();
        student.setMarks(marksSem4_1, marksSem4_2, marksSem4_3, marksSem4_4);

        scanner.close(); 
    }
}
