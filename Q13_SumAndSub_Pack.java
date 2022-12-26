//Q13. WAP to create a package Calc with methods Sum() & Sub() and show the Implementation in a class.
package JAVA_Lab_File;

import Calc.Add;
import Calc.Subtract;

import java.util.Scanner;

public class Q13_SumAndSub_Pack {
    public static void main(String[] args)
    {
        System.out.println("Sum ");
        System.out.println("Subtract ");

        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        switch (t) {
            case 1 -> {
                Add a = new Add();
                a.sum();
            }
            case 2 -> {
                Subtract s = new Subtract();
                s.subtract();
            }
            default -> System.out.println("invalid choice");
        }
    }
}
