// Q7. Input a year and find whether it is a leap year or not.

//To know about leap year go to: https://learn.microsoft.com/en-us/office/troubleshoot/excel/determine-a-leap-
package JAVA_Lab_File;

import java.util.Scanner;

public class Q7_leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year, to check if it's a leap year or not: ");
        int year = input.nextInt();

        if (year%4 == 0) {
            if (year%100 == 0) {
                if(year%400 == 0) {
                    System.out.println("The given year "+ year + " is a leap year.");
                } else {
                    System.out.println("The given year "+ year + " is not a leap year.");
                }
            } else {
                System.out.println("The given year "+ year + " is a leap year.");
            }
        } else {
            System.out.println("The given year "+ year + " is not a leap year.");
        }
    }
}
