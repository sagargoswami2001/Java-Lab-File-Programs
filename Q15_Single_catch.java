//Q15. WAP to show the working of a single Catch block.
package JAVA_Lab_File;

public class Q15_Single_catch {
    public static void main(String[] args) {
        try{
            int a = 10;
            int b = 0;
            int c = a/b; // exception
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
