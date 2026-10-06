public class ShapeRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Area: " + rectangle.getArea());
    }
}
class Shape {
    double getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    private double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double getArea() {
        return length * width;
    }
}
