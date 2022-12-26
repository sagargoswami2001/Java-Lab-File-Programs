//Q21. WAP to show working of a progress bar.
package JAVA_Lab_File;

import javax.swing.*;

public class Q21_Progress_bar extends JFrame {
    static JFrame f;
    static JProgressBar b;

    public static void main(String[] args) {
        f = new JFrame("Zaphkiel's Progress Bar");
        b = new JProgressBar(0, 2000);
        b.setBounds(40, 40, 160, 30);
        b.setValue(0);
        b.setStringPainted(true);
        f.add(b);
        f.setSize(250, 150);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fill();
    }
    public static void fill()
    {
        int i = 0;
        try {
            while (i <= 100) {
                b.setValue(i + 10);

                Thread.sleep(1000);
                i += 20;
            }
        }
        catch (Exception e) {
        }
    }
}
