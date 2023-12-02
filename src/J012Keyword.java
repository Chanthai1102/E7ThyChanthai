package src;
class Firsts {
    int x;

    public Firsts(int x) {
        this.x = x;
    }

    protected void finalize() throws Throwable {
        System.out.println("Welcome to Finalize Keyword in Java Programming " + x);
    }
}

public class J012Keyword {
    public static void main(String args[]) {
         Firsts f1 = new Firsts(100);
         Firsts f2 = new Firsts(200);

         f1 = f2;
         System.gc();
         System.out.println("Hello Word");
    }
}
