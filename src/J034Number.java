import java.util.*;
public class J034Number {
    public static void main(String args[]) {
        int x;
        System.out.println("Please insert any number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x % 2 == 0)
            System.out.println("This is an even number");
        else
            System.out.println("This is an odd number");

    }
}
