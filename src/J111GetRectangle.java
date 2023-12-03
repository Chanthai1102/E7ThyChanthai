package src;
class Area {
        int height;
        int width;
}
public class J111GetRectangle  extends Area{
    int area;
    public void TotalArea() {
        area = width*height;
    }

    public static void main(String args[]) {
        J111GetRectangle gr = new J111GetRectangle();

        gr.width = 25;
        gr.height = 13;

        gr.TotalArea();
        System.out.println("The result of the area of your rectangle is: " + gr.area);
    }
}
