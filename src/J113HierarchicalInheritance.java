package src;
class LevelA1 {
        public void showA() {
        System.out.println("This is level A");
        }
}

        class LevelB1 extends LevelA {
        public void showB()
        {
        System.out.println("This is level B");
        }
        }

        class LevelC1 extends LevelA {
        public void showC() {
        System.out.println("This is level C");
        }
}

        class LevelD extends LevelA {
        public void showD() {
        System.out.println("This is level D");
        }
}
public class J113HierarchicalInheritance {
    public static void main(String args[]) {
        LevelB1 lb = new LevelB1();
        lb.showA();
        lb.showB();

        LevelC1 lc = new LevelC1();
        lc.showC();
        //lc.showA();

        LevelD ld = new LevelD();
        ld.showD();
        //ld.showA();
    }
}
