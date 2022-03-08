import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
System.out.print("Enter the first name: ");
String firstName=scan.nextLine();
System.out.print("Enter the last name: ");
String lastName=scan.nextLine();
System.out.print("Enter age: ");
int age=scan.nextInt();
System.out.print("Enter the salary: ")
double salary=scan.nextDouble();

        /**
         * Continue code here to ask for the first name, last name, age, and salary, IN THAT ORDER
         */

    }

    public String toString() {
        // insert logic for toString method
return firstName+" "+lastName+", "+age+", "+salary
    }
}