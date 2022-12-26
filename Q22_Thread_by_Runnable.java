//Q22. WAP to create threads by using Runnable interface
package JAVA_Lab_File;

public class Q22_Thread_by_Runnable implements Runnable {
    public void run() {
        System.out.println("Thread Implemented by Runnable interface is running...");
    }

    public static void main(String[] args) {
        Q22_Thread_by_Runnable obj = new Q22_Thread_by_Runnable();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
