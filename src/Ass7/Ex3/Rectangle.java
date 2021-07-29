package Ass7.Ex3;

class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        super();
        width = -1;
        length = -1;
    }
    public Rectangle(double width, double length){
        super();
        this.width= width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
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
        return width* length;
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

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}

