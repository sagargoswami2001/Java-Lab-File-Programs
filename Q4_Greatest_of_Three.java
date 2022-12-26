//Q4. WAP to find the greatest number of three numbers
package JAVA_Lab_File;

public class Q4_Greatest_of_Three {
    static int biggestOfThree(int x, int y, int z)
    {
        return Math.max(z, (Math.max(x, y)));
    }
    public static void main(String[] args)
    {
        int a, b, c;
        int largest;
        a = 5;
        b = 10;
        c = 3;
        largest = biggestOfThree(a, b, c);
        System.out.println(largest+ " is the largest number.");
    }
}
