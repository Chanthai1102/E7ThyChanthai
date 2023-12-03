package src;

public class J107CloneObject implements Cloneable {
    String name;
    int record;

    public J107CloneObject(String name, int record) {
        this.name = name;
        this.record = record;
    }

    public void show() {
        System.out.println("Welcome " + name + "! Your score is: " + record);
    }

    public static void main(String args[]) {
        J107CloneObject co = new J107CloneObject("David", 98);
        try {
            J107CloneObject co1 = (J107CloneObject) co.clone();
            co1.show();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
