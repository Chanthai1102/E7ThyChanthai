import java.util.Scanner;

public class J025Paschal {
    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number of rows you want: ");

        x = sc.nextInt();
        System.out.println("result of Paschal Triangle is: ");
        for (y = 0; y < x; y++) {
            int num1 = 2;
            System.out.format("%" + (x - y) * 2 + "s", "");
            for (z = 0; z <= y; z++) {
                System.out.format("%4d", num1);
                num1 = num1 * (y - z) / (z + 1);
            }
            System.out.println();
        }
    }
}
