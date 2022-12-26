//Q14. WAP to print reverse of a given number.
package JAVA_Lab_File;

import java.util.Scanner;

public class Q14_Reverse_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to reverse it: ");
        int num = sc.nextInt();
        int r_num=0;
        while(num>0)
        {
            r_num=(r_num*10)+(num%10);
            num=num/10;
        }
        System.out.println("Reversed: "+ r_num);
    }
}
