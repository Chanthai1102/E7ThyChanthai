package src;
import java.util.*;
public class J087Nonrepeated {
    public static void main(String args[]) {
        Map<Character, Integer> chmap = new HashMap();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert only string value: ");
        String Str1 = sc.nextLine();

        for(int x=0; x<Str1.length(); x++) {
            char ch = Str1.charAt(x);
            if(chmap.containsKey(ch)) {
                chmap.put(ch, chmap.get(ch)+1);
            } else {
                chmap.put(ch, 1);
            }
        }

        for(int x=0; x<Str1.length(); x++) {
            if(chmap.get(Str1.charAt(x)) == 1) {
                System.out.println("First non-repeated character of " + Str1 + " is " + Str1.charAt(x));
                break;
                }
            }
        }

}
