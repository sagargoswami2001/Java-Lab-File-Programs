//Q3. WAP to print prime number between 10 and 100.
package JAVA_Lab_File;

public class Q3_PrimeNo_BW_Range {
    public static int isprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return -1;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        int lower_bound = 10, upper_bound = 100;

        for (int i = lower_bound; i <= upper_bound; i++) {
            if (isprime(i) == 1) {
                System.out.print(i + " ");
            }
        }
    }

}
