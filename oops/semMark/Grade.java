package oops.semMark;

public class Grade {
	  char getGrade(int totalMarks) {  // parameter with datatype.
	    	if (totalMarks >= 200) {
	            return 'A';
	        } else if (totalMarks >= 150) {
	            return 'B';
	        } else if (totalMarks >= 100) {
	            return 'C';
	        } else if (totalMarks >= 50) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }

}
