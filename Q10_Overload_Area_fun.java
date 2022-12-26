//Q10. WAP to show the overloading of area function.
package JAVA_Lab_File;

import java.util.Scanner;

public class Q10_Overload_Area_fun {
    static void area(double radius){
        double area = Math.PI * radius * radius;
        System.out.print("Area of Circle is: " + String.format("%.5f", area) + " sq. units");
    }
    static void area(double base, double height){
        double area = 0.5*base*height;
        System.out.print("Area of Triangle is: " + String.format("%.5f", area) + " sq. units");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Area: \n1.Circle\n2.Triangle\nChoice: ");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            area(radius);
        } else if (choice == 2) {
            System.out.print("Enter the base and height of the triangle: ");
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            area(base, height);
        }else {
            System.out.println("Invalid choice");
        }
    }
}
