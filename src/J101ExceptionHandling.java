package src;

public class J101ExceptionHandling {
    public String FinallyBlock() {
        try {
            return "Return from try block";
        } finally {
            System.out.println("Return from finally block after return statement");
        }
    }

    public static void main(String args[]) {
        System.out.println(new J101ExceptionHandling().FinallyBlock());
    }
}
