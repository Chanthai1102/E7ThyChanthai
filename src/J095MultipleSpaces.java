package src;
import java.util.StringTokenizer;

public class J095MultipleSpaces {
    public static void main(String args[]) {
        String Str1 = "Hello World and Today is java";
        StringTokenizer Str2 = new StringTokenizer(Str1, " ");
        StringBuffer Str3 = new StringBuffer();

        while (Str2.hasMoreElements()) {
            Str3.append(Str2.nextElement()).append(" ");
        }
        System.out.print(Str3.toString().trim());
    }
}
