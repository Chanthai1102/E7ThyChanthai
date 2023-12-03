package src;
import java.util.ArrayList;
import java.util.List;
public class J108ArraySubList {
    public static void main(String args[]) {
        ArrayList<String> alist = new ArrayList<String>();

        alist.add("111");
        alist.add("222");
        alist.add("333");
        alist.add("444");
        alist.add("555");
        alist.add("666");
        alist.add("777");
        alist.add("888");
        alist.add("999");

        System.out.println("Total arraylist is: " + alist);

        List<String> list1 = alist.subList(2,5);
        System.out.println("The rsult of the sublist is: " + list1);

        ArrayList<String> list2 = new ArrayList<String>(alist.subList(3,6));
        System.out.println("The result of the stored list is" + list2);

    }
}
