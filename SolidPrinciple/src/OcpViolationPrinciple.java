class Circle {
    private int diameter;
    private int length;

    Circle(int diameter, int length) {
        this.diameter = diameter;
        this.length = length;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public int getLength() {
        return this.length;
    }
}

class Rectangle {
    private int width;
    private int height;

    Rectangle(int diameter, int length) {
        this.width = diameter;
        this.height = length;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}

class CalcArea {
    public void areaCal(Object obj) {
        if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            System.out.println("Circle Area: " + circle.getDiameter() * circle.getLength() * 3.14);
        } else {
            Rectangle rectangle = (Rectangle) obj;
            System.out.println("rectangle Area: " + rectangle.getHeight() * rectangle.getWidth());
        }
    }
}

public class OcpViolationPrinciple {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 8);
        Rectangle rectangle = new Rectangle(2, 8);
        CalcArea calcArea = new CalcArea();
        calcArea.areaCal(circle);
        calcArea.areaCal(rectangle);
    }
}
