import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
System.out.print("Enter the first number: ");
int num1= scan.nextInt();
System.out.print("Enter the operator: ");
String operator=scan.nextLine();
System.out.print("Enter the second number: ");
int num2=scan.nextInt();

      if(operator=="+"){
add(num1,num2)}
      if(operator=="-"){
subtract(num1,num2)}
      if(operator=="*")
multiply(num1,num2)}
      if(operator=="/"){
divide(num1,num2)}

    }

    public String add(int a, int b) {
        int result=a+b;
        return "a+b= "+result;
    }

    public String subtract(int a, int b) {
        int result=a-b;
return "a"+"+"+"b"+"=result;
    }

    public String multiply(int a, int b) {
        int result a*b;
return "a*b= "+result;
    }

    public String divide(int a, int b) {
      int result=a/b;
return "a/b= "+result;
    }
}