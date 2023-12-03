package src;

public class J093RunnableInterface implements Runnable {
    public static void main(String args[]) {
        J093RunnableInterface runthread = new J093RunnableInterface();
        Thread th = new Thread(runthread);
        th.start();
    }

    @Override
    public void run() {
        System.out.println("This is a runnable interface...");
    }
}