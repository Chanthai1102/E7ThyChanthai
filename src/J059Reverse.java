import java.util.*;
public class J059Reverse {

	public static void main(String[] args) {
		int num1 = 0, num2, reversenum1 = 0;
		
		System.out.println("Please insert different numbers");
		Scanner sc = new Scanner(System.in);
		num2 = num1 = sc.nextInt();
		
		for(;num1 !=0; ){
		reversenum1 = reversenum1*10;
		reversenum1 = reversenum1 + num1%10;
		num1 = num1/10;
		}
		System.out.println("The reveresed result of " + num2 + " is: " + reversenum1);

	}

}
