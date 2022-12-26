//Q11. WAP to check whether a given number is Armstrong or not.
package JAVA_Lab_File;

public class Q11_isArmstrong {
    public static void main(String[] args) {

        int number = 153, originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
