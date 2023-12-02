package src;
import java.util.*;

public class J028Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Width and Height of the Triangle: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        double result = (w*h)/2;
        System.out.println("Result of area of triangle is: " + result);
        }
}
