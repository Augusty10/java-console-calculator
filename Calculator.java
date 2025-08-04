import java.util.Scanner;

public class Calculator {
public static double  add(double a, double b) {
    return a+b;                            // Method to add two numbers 
}
public static double subtract(double a, double b){
    return a-b;         // Method to subtract two numbers   
}
public static double multiply(double a, double b){
    return a*b;     // method to multiply two numbers 
}
 public static double divide(double a, double b){
    if (b==0){
        System.out.println("Error: Division by zero is not allowed.");
        return Double.NaN;  // Return NaN for division by zero 
    }
    return  a/b;    // Method to divide two Numbers
 }   
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);   // Create a Scanner object to read input from the user 
    double num1, num2, result;
    char operator;
    String choice;

    System.out.println("Welcome to the calculator program !");
    do {
        System.out.println("Enter first Number: ");
        num1 = sc.nextDouble(); 
        
        System.out.println("Enter an Operato (+,-,*,/, ): ");
        operator =sc.next().charAt(0);  

        System.out.println("Enter second Number: ");
        num2 = sc.nextDouble();

        switch(operator){
            case'+':
                result = add(num1, num2);
                System.out.println("Result: " +result);
                break;
            case'-':
                result = subtract(num1, num2);
                System.out.println("Result : "+result);
                break;

            case'*':
             result = multiply(num1, num2);
                System.out.println("Result: "+ result);
                break;

            case '/':
            result = divide(num1, num2);
            if(!Double.isNaN(result)){
                System.out.println("Result: "+result);
            }    
            break;

            default:
                System.out.println("invalid Operator ! Please try again with a valid operator."); 
        }
System.out.println("Do you want to perform another calculation? (yes/no): ");
choice = sc.next().toLowerCase(); 
    }while (choice.equals("yes"));
    
    System.out.println(" Thank you ");
    sc.close();   // Close the scanner to prevent resource leaks

}

}
