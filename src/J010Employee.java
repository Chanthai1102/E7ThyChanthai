public class J010Employee {
    final int Reg_No;

    J010Employee(int num) {
        Reg_No = num;
    }

    void display() {
        System.out.println("Employee number is: " + Reg_No);
    }

    public static void main(String args[]) {
        J010Employee em = new J010Employee(201);
        em.display();
    }
}
