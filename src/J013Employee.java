public class J013Employee {
    int Reg_No;
   String Name;
  static String Company = "Gstevewall";
  J013Employee(int a, String b) {
         Reg_No = a;
         Name = b;
  }

  void display() {
         System.out.println("Your details are: " + Reg_No + " " + Name + " " + Company);
  }
  public static void main(String args[]) {
      J013Employee em = new J013Employee(201, "Ejike");
      em.display();
  }

}
