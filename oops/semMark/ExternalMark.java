package oops.semMark;

import java.util.Scanner;

public class ExternalMark {
    int extSem1;
    int extSem2;
    int extSem3;
    int extSem4;

    public void setExternalMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter external marks for Semester 1:");
        extSem1 = scanner.nextInt();

        System.out.println("Enter external marks for Semester 2:");
        extSem2 = scanner.nextInt();

        System.out.println("Enter external marks for Semester 3:");
        extSem3 = scanner.nextInt();

        System.out.println("Enter external marks for Semester 4:");
        extSem4 = scanner.nextInt();

        scanner.close(); // Close the scanner to prevent resource leak
    }

    void externaldisplay() {
    	
        System.out.println("External Marks:");
        System.out.println("Semester 1: " + extSem1);
        System.out.println("Semester 2: " + extSem2);
        System.out.println("Semester 3: " + extSem3);
        System.out.println("Semester 4: " + extSem4);
    }

    int getTotalExternalMarks() {
        return extSem1 + extSem2 + extSem3 + extSem4;
    }
}
