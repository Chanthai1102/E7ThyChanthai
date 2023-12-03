package src;

public class J092UseThread extends Thread {
    public void run() {
        System.out.println("This is a runnable thread...");
    }

    public static void main(String args[]) {
        J092UseThread ust = new J092UseThread();
        ust.start();
    }
}
