import java.io.*;
 class MethodCall  {
    int sum(int num1, int num2) {
         return(num1*num2);
    }
}
public class J007OverLoading {
         public static void main(String args[]) throws NumberFormatException, IOException {
         int x,y;

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Please, enter two Integers: ");
         x = Integer.parseInt(br.readLine());
         y = Integer.parseInt(br.readLine());

         MethodCall ol = new  MethodCall();
         System.out.println("Result of your numbers are : " + ol.sum(x, y));
         }
}
