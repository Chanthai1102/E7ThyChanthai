package src;

public class J104DefineException extends Exception {
    String sr1;
    J104DefineException(String sr2) {
        sr1 = sr2;
    }
public String toString() {
        return ("Our result is: " + sr1);
    }
}
class UserDefineException {
    public static void main(String args[]) {
        try {
            throw new J104DefineException("a user defined Exception");
        } catch(J104DefineException exp) {
            System.out.println("This is inside the catch block");
            System.out.println(exp);
        }
    }
}
