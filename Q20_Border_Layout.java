//Q20. WAP to arrange components using border layout.
package JAVA_Lab_File;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

public class Q20_Border_Layout {
        // Main Method
        public static void main(String[] args) {
            BorderDemo obj = new BorderDemo();
        }
}
class BorderDemo extends JFrame{
    public BorderDemo()
    {
        setLayout(new BorderLayout());

        setBackground(Color.red);

        Button btn1 = new Button("Zaphkiel's");

        Button btn2 = new Button("Kurumi");

        Button btn3 = new Button("Tokisaki");

        Button btn4 = new Button("Nightmare");

        Button btn5 = new Button("Darling");

        add(btn1, "North");

        add(btn2, "South");

        add(btn3, "East");

        add(btn4, "West");

        add(btn5, "Center");

        setTitle("Zaphkiel's Border Layout");

        setSize(350, 300);

        setVisible(true);
    }

}
