//Q16. WAP to show working of throw and throws for handling exceptions
package JAVA_Lab_File;

import java.io.IOException;

public class Q16_Throw_and_Throws {

    public static void main(String[] args) throws IOException {
        //declare exception
        Test.method();
        System.out.println("The Normal flow...");
    }
}
class Test {
    static void method()throws IOException
    {
        throw new IOException("Zaphkiel error");//checked exception
    }
}

