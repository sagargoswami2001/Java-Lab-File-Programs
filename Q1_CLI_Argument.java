//Q1. WAP to enter two numbers using command line argument and calculate their sum and multiplication.
package JAVA_Lab_File;

public class Q1_CLI_Argument {
    public static void main(String[] args) {
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        int multiplication = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);

        System.out.println("Sum of two CLI Arguments: " + (sum));
        System.out.println("Multiplication of two CLI Arguments: " + (multiplication));
    }
}
