//Q12. WAP to check whether a given number is Armstrong or not.
package JAVA_Lab_File;

interface Animal {
    public void animalSound();
    public void sleep();
}
class Siyaar implements Animal {
    public void animalSound() {
        System.out.println("The Siyaar howls: Aaooo Aaooo");
    }
    public void sleep() {
        System.out.println("Zzz");
    }
}
public class Q12_Implement_interface {

    public static void main(String[] args) {
        Siyaar S_Siyaar = new Siyaar();
        S_Siyaar.animalSound();
        S_Siyaar.sleep();
    }
}
