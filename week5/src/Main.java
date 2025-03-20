import java.awt.*;
import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Point p1 = new Point();
        String s1 = new String("avcı");
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);
        Point p2 = new Point(3,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);
        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.xCoord);


        Rectangle r1 = new Rectangle(
                new Point(3,4),
                3,
                4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.get.SideB());
        System.out.println(r1.get.Topleft().xCoord);
        System.out.println(r1.get.Topleft().yCoord);

    }
}