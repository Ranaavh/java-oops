 package oops.semMark;

public class SemMark {
    public static void main(String[] args) {
        InternalMark internalsem1 = new InternalMark();
        InternalMark internalsem2 = new InternalMark();
        InternalMark internalsem3 = new InternalMark();
        InternalMark internalsem4 = new InternalMark();
        ExternalMark externalMark = new ExternalMark();
        Grade grade=new Grade();

        
        
        internalsem1.internal(1, 60);
        internalsem1.internaldisplay();// objectname.method ( in InternalMark //other class )
        internalsem2.internal(2, 40);
        internalsem2.internaldisplay();
        internalsem3.internal(3, 80);
        internalsem3.internaldisplay();
        internalsem4.internal(4, 100);
        internalsem4.internaldisplay();
        
        int totalInternalMarks = internalsem1.mark + internalsem2.mark + internalsem3.mark + internalsem4.mark;
        
        externalMark.setExternalMarks();
        externalMark.externaldisplay();

        
             
        int totalExternalMarks = externalMark.getTotalExternalMarks();// return values oridhil store akum..then a name vech print akm
        int totalMarks=totalInternalMarks + totalExternalMarks;
        char totalGrade=grade.getGrade(totalMarks);

        System.out.println("Total Internal Marks: " + totalInternalMarks);
        System.out.println("Total External Marks: " + totalExternalMarks);
        System.out.println("Total Marks (Internal + External): " + totalMarks);
        System.out.println("Total Grade :" +totalGrade);
    }
}
