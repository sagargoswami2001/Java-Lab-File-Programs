package Calc;

import java.util.Scanner;

public class Add {
    int sum;
    public void sum()
    {
        System.out.print("Enter the first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        sum = firstNum+secondNum;
        System.out.println("Sum=" + sum);
    }
}
