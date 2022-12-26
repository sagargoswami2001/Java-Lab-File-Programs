//Q9. WAP to show working of inner class using instance of outer class
package JAVA_Lab_File;

public class Q9_inner_class_inst {
        int x = 10;
        class InnerClass {
            int y = 5;
        }
}
class Main {
    public static void main(String[] args) {
        Q9_inner_class_inst myOuter = new Q9_inner_class_inst();
        Q9_inner_class_inst.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("innerClass.x + OuterClass.x: "+(myInner.y + myOuter.x));
    }
}