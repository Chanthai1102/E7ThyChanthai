package src;
import java.util.*;
public class J072Amstrong {
    public static void main(String args[]) {
        int x, y, z = 0, ams;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert only positive numbers: ");

        x=sc.nextInt();
        y=x;

        while(y!=0) {
            ams = y%10;
            z = z + ams*ams*ams;
            y = y/10;
        }
        if(z == x) {
            System.out.println(x + " is an Amstrong Number");
        } else {
            System.out.println(x + " is not an Amstrong Number");
        }
    }
}
