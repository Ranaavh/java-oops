package oops.semMark;

public class InternalMark {
    int sem;
    int mark;

    void internal(int s, int m) {
        sem = s;
        mark = m;
    }

    void internaldisplay() {
 
        System.out.println("Semester " + sem + ": " + mark);
    }
    

   
    
  
}

