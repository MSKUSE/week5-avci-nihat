public class Rectangle {
    private Point topLeft;
    private int sideA, sideB;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);

    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0) {
            this.sideA = 0;
            System.out.println("not negative");
        } else {


        this.sideA = sideA;
    }}

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("not negative");
        } else {

            this.sideB = sideB;
        }
    }
}

public int perimeter() {
    return 2 * (sideA + sideB);
}

public int area() {
    return sideA * sideB;
}
}

