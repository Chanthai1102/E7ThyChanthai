package src;
class Odd extends Thread {
    public void run() {
        for (int x = 1; x <= 10; x++) {
            if (x % 2 != 0) {
                System.out.println(x + " is an odd number");
            } else {
                System.out.println(x + " is not an odd number");
            }
        }
    }
}

public class J122OddNumbers {
    public static void main(String args[]) {
        Odd o = new Odd();
        o.start();
    }
}
