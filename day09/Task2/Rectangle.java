package day09.Task2;

public class Rectangle extends Figure {
    private double width, height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
