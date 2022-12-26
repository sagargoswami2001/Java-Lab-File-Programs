//Q19. WAP to show working of Vector class in java.
package JAVA_Lab_File;

import java.util.Iterator;
import java.util.Vector;

public class Q19_Vector_Class {
    public static void main(String args[]) {
        //Create a vector
        Vector<String> waifus = new Vector<String>();
        //Adding elements using add() method of List
        waifus.add("Kurumi");
        waifus.add("Rias");
        waifus.add("ZeroTwo");
        waifus.add("Yorha 2B");

        //Adding elements using addElement() method of Vector
        waifus.addElement("Akeno");
        waifus.addElement("Rindou");
        waifus.addElement("Momo");

        System.out.println("Elements are: "+waifus);
    }
}
