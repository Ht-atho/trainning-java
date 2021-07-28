package Ass7;

public class Exercise3 {
    Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape

    s1.getArea();          // which version?
    s1.getPerimeter();     // which version?
    s1.getColor());
    s1.isFilled());
    s1.getRadius());

    Circle c1 = (Circle)s1;                   // Downcast back to Circle
    c1);
    c1.getArea());
    c1.getPerimeter());
    c1.getColor());
    c1.isFilled());
    c1.getRadius());

    Shape s2 = new Shape();

    Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
    s3);
    s3.getArea());
    s3.getPerimeter());
    s3.getColor());
    s3.getLength());

    Rectangle r1 = (Rectangle)s3;   // downcast
    r1);
    r1.getArea());
    r1.getColor());
    r1.getLength());

    Shape s4 = new Square(6.6);     // Upcast
    s4);
    s4.getArea());
    s4.getColor());
    s4.getSide());

    // Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
    Rectangle r2 = (Rectangle)s4;
    r2);
    r2.getArea());
    r2.getColor());
    r2.getSide());
    r2.getLength());

    // Downcast Rectangle r2 to Square
    Square sq1 = (Square)r2;
    System.out.print(sq1);
    sq1.getArea());
    sq1.getColor());
    sq1.getSide());
    sq1.getLength());

}
abstract class Shape{
    protected String color;
    protected Boolean filled = true;
public Shape(){
}
    public Shape(String color, Boolean filled){
    this.color = color;
    this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled(){
    return true;
    }
    public abstract double getArea();
    public abstract double gePerimeter();

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
    
}
class Circle extends Shape{
    protected double radius =1.0;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double gePerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle[ Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                "], radius=" + radius +
                ']';
    }
}
class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width= width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double gePerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle[ Shape[ " +
                "color='" + color + '\'' +
                ", filled=" + filled +
                "], width=" + width +
                ", length=" + length +
                ']';
    }
}
class Square extends Rectangle{
    protected double side;
    public Square(){
    }
    public Square(double side){
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                "], width=" + width +
                ", length=" + length +
                "], side=" + side +
                ']';
    }
}