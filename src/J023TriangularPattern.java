public class J023TriangularPattern {
    public static void main(String args[]) {
        int x,y;
        for(x=7;x>=1;x--) {
            for(y=1;y<=x;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
