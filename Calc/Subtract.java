package Calc;

import java.util.Scanner;

public class Subtract {
    int difference;
    public void subtract()
    {
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        difference = firstNum-secondNum;
        System.out.println("Difference=" + difference);
    }
}
