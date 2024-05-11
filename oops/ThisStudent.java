import java.util.*;

class Student {
    String name;
    int markPlusTwo;
    int entranceMark;
    String caste;

    // Constructor
    public Student(String name, int markPlusTwo, int entranceMark, String caste) {
        this.name = name;
        this.markPlusTwo = markPlusTwo;
        this.entranceMark = entranceMark;
        this.caste = caste;
    }

    // Calculate total marks
    public int calculateTotalMark() {
        return markPlusTwo + entranceMark;
    }

    // Method to calculate rank based on total marks
    public int calculateRank(List<Student> students) {
        Collections.sort(students, Comparator.comparingInt(s -> s.calculateTotalMark()));
        Collections.reverse(students);
        return students.indexOf(this) + 1;
    }
}

class College {
    String name;

    // Constructor
    public College(String name) {
        this.name = name;
    }

    // Method to allot department based on rank and caste
    public String allotDepartment(Student student, int rank) {
        // Logic to allot department based on rank and caste
        // Example logic:
        if (rank <= 10) {
            return "Computer Science";
        } else if (rank <= 20) {
            return "Electronics";
        } else if (rank <= 30) {
            return "Mechanical";
        } else if (rank <= 40) {
            return "Civil";
        } else {
            return "Chemical";
        }
    }
}

public class ThisStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating students
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Total marks of Plus Two: ");
            int markPlusTwo = scanner.nextInt();
            System.out.print("Entrance mark: ");
            int entranceMark = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.print("Caste: ");
            String caste = scanner.nextLine();

            // Create Student object and add to list
            students.add(new Student(name, markPlusTwo, entranceMark, caste));
        }

        // Creating colleges
        College college1 = new College("XYZ College");
        College college2 = new College("ABC College");
        College college3 = new College("PQR College");
        College college4 = new College("LMN College");
        College college5 = new College("DEF College");

        // Calculate ranks and allot departments
        for (Student student : students) {
            int rank = student.calculateRank(students);
            System.out.println(student.name + "'s Rank: " + rank);

            // Selecting college based on rank
            College selectedCollege;
            if (rank <= 10) {
                selectedCollege = college1;
            } else if (rank <= 20) {
                selectedCollege = college2;
            } else if (rank <= 30) {
                selectedCollege = college3;
            } else if (rank <= 40) {
                selectedCollege = college4;
            } else {
                selectedCollege = college5;
            }

            String department = selectedCollege.allotDepartment(student, rank);
            System.out.println(student.name + " got allotted to " + department + " in " + selectedCollege.name);
        }

        scanner.close();
    }
}
