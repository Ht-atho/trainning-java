package Ass7.Ex3;

class Circle extends Shape{
    protected double radius =1.0;
    public Circle(){
        super();
        radius = -1;

    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius *radius;
    }

    @Override
    public String toString() {
        return "Circle[ Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                "], radius=" + radius +
                ']';
    }

    @Override
    public double getPerimeter() {
        return Math.PI*radius *2;
    }
}

