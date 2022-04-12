import java.util.Scanner;
public class GradeAggregator {
    public static void main(String[] args) {
        int[] assignments = new int[5];
        double attendance,midterm;
        double overallAssignment=0;
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < assignments.length; i++) {
            System.out.print("Input the grade of assignment " + (i+1));
            assignments[i]=scan.nextInt();
        }

        System.out.println("Input the number of attended labs: ");
        attendance = scan.nextInt();


        System.out.println("Input the midterm grade: ");
        midterm = scan.nextInt();

        for (int i = 0; i < assignments.length; i++) {
            overallAssignment+=assignments[i];
        }
        
        overallAssignment/=5;
        overallAssignment*=0.3;

        attendance = attendance*100*0.05*1/7;

        midterm*=0.3;


        System.out.print("Assignments (30%): ");
        System.out.println(overallAssignment);

        System.out.print("Attendance (5%): ");
        System.out.println(attendance);

        System.out.print("Midterm (30%): ");
        System.out.println(midterm);





        

        
        
    }
}