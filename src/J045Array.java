package src;
import java.util.*;
public class J045Array {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        al.add("E");
        al.add("J");
        al.add("I");
        al.add("K");
        al.add("E");

        System.out.println("Before reversal: " + al);

        Collections.reverse(al);
        System.out.println("After reversal: " + al);
    }
}
