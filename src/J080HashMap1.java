package src;
import java.util.*;

public class J080HashMap1 {
    public static void main(String args[]) {
        Map<String, String> mp = new HashMap<String, String>();

        mp.put("1", "Monday");
        mp.put("2", "Tuesday");
        mp.put("3", "Wednesday");
        mp.put("4", "Thursday");
        mp.put("5", "Friday");
        mp.put("6", "Saturday");
        mp.put("7", "Sunday");

        Iterator<Map.Entry<String, String>> it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            System.out.println("Key: " + entry.getKey() + "Value is: " + entry.getValue());
        }
    }
}
