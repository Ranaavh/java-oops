package oops.thisStudent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Plus Two marks
        System.out.print("Enter Plus Two marks (out of 1200): ");
        int plusTwoMarks = scanner.nextInt();

        // Input entrance marks
        System.out.print("Enter entrance marks (out of 500): ");
        int entranceMarks = scanner.nextInt();

        // Validate Plus Two marks and entrance marks
        if (plusTwoMarks < 0 || plusTwoMarks > 1200 || entranceMarks < 0 || entranceMarks > 500) {
            System.out.println("Invalid marks! Marks should be between 0 and 1200 for Plus Two and between 0 and 500 for entrance.");
            scanner.close();
            return;
        }

        // Input caste
        System.out.print("Enter caste ( G for General, O for OBC, S for SC and T for ST): ");
        char casteInitial = scanner.next().charAt(0);
        String caste;
        switch (Character.toUpperCase(casteInitial)) {
            case 'G':
                caste = "General";
                break;
            case 'O':
                caste = "OBC";
                break;
            case 'S':
                caste = "SC";
                break;
            case 'T':
                caste = "ST";
                break;
            default:
                caste = "Unknown";
                break;
        }

        // Create Student object
        Student student = new Student("John", plusTwoMarks, entranceMarks, caste);

        // Calculate total marks
        int totalMarks = student.calculateTotalMarks();

        // Output total marks
        System.out.println("Total marks: " + totalMarks);

        // Determine rank based on total marks criteria
        int rank;
        if (totalMarks >= 1100) {
            rank = 1;
        } else if (totalMarks >= 1000) {
            rank = 2;
        } else if (totalMarks >= 900) {
            rank = 3;
        } else if (totalMarks >= 800) {
            rank = 4;
        } else {
            rank = 5;
        }

        // Output rank
        System.out.println("Rank: " + rank);
        
        // College allotment
        College college;
        if (rank == 1) {
            college = new College("Elite College A");
        } else if (rank == 2) {
            college = new College("Elite College B");
        } else if (rank == 3) {
            college = new College("Average College C");
        } else {
            college = new College("Average College D");
        }

        // Allot department
        String department = college.allotDepartment(student, rank);


       

        // Output college and department
        System.out.println("College: " + college.getName());
        System.out.println("Department: " + department);

        scanner.close();
    }
}