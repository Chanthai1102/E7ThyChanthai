
public class J062Swap2 {

	public static void main(String[] args) {
		int x = 200;
		int y = 500;
		
		System.out.println("Values before swapping");
		System.out.println("Value of x is: " + x);
		System.out.println("Value of y is: " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("\n");
		
		System.out.println("Values after swapping");
		System.out.println("Value of x is: " + x);
		System.out.println("Value of y is: " + y);


	}

}
