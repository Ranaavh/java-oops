package oops.thisStudent;

class Student {
    private String name;
    private int plusTwoMarks;
    private int entranceMarks;
    private String caste;

    // Constructor
    public Student(String name, int plusTwoMarks, int entranceMarks, String caste) {
        this.name = name;
        this.plusTwoMarks = plusTwoMarks;
        this.entranceMarks = entranceMarks;
        this.caste = caste;
    }

    // Calculate total marks
    public int calculateTotalMarks() {
        return this.plusTwoMarks + this.entranceMarks;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getCaste() {
        return this.caste;
    }
}