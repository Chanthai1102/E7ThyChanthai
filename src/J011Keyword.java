public class J011Keyword {
    final void display() {
        System.out.println("This is a final Method");
    }
}
class Hello extends J011Keyword {
    public static void main(String args[]) {
         Hello hl = new Hello();
         hl.display();
    }
}

