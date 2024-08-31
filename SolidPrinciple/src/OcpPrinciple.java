interface CalculateArea {
    public void calArea();
}

abstract class AreaCalculater {
    public abstract void calArea();
}

class Square implements CalculateArea {
    public int getDiameter() {
        return diameter;
    }

    public Square(int diameter) {
        this.diameter = diameter;
    }

    private int diameter;

    @Override
    public void calArea() {
        System.out.println("circle Area: " + diameter * 2);
    }
}

class Triangle extends AreaCalculater {
    private float height;
    private float width;

    public Triangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public void calArea() {
        System.out.println("Triangle Area: " + height * width);
    }
}

public class OcpPrinciple {
    public static void main(String[] args) {
        Square square = new Square(12);
        Triangle triangle = new Triangle(7, 11);
        triangle.calArea();
        square.calArea();
    }
}
