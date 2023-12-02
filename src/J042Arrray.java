import java.util.Arrays;

public class J042Arrray {
    public static void main(String args[]) {
        int x[] = {3, 4, 8, 9, -4, 0, 5, 7, -9};
        Arrays.sort(x);
        printArray("The sorted Array is: ", x);
    }

    private static void printArray(String string, int[] x) {
        for (int y = 0; y < x.length; y++) {
            if (y != 0) {
                System.out.print(",");
            }
            System.out.print(x[y]);
        }
        System.out.println();

    }
}
