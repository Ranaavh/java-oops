package oops.thisStudent;


class College {
    private String name;

    // Constructor
    public College(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    // Allot department based on rank and caste
    public String allotDepartment(Student student, int rank) {
        String department;
        if (rank == 1) {
            if (student.getCaste().equals("ST")) {
                department = "Civil";
            } else if (student.getCaste().equals("SC")) {
                department = "Electronics";
            } else if (student.getCaste().equals("OBC")) {
                department = "Mechanical";
            } else {
                department = "Computer Science";
            }
        } else if (rank ==2) {
            if (student.getCaste().equals("ST")) {
                department = "Civil";
            } else if (student.getCaste().equals("SC")) {
                department = "Electronics";
            } else if (student.getCaste().equals("OBC")) {
                department = "Mechanical";
            } else {
                department = "Computer Science";
            }
        } else if (rank == 3) {
            if (student.getCaste().equals("ST")) {
                department = "Mechanical";
            } else if (student.getCaste().equals("SC")) {
                department = "Civil";
            } else if (student.getCaste().equals("OBC")) {
                department = "Electronics";
            } else {
                department = "Computer Science";
            }
        } else {
            if (student.getCaste().equals("ST")) {
                department = "Mechanical";
            } else if (student.getCaste().equals("SC")) {
                department = "Civil";
            } else if (student.getCaste().equals("OBC")) {
                department = "Electronics";
            } else {
                department = "Computer Science";
            }
        }
        return department;
    }
}