package Ass7.Ex3;

abstract class Shape{
    protected String color;
    protected Boolean filled = true;
    public Shape(){
        this.color = "No color";
        this.filled = false;
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

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }

    public abstract double getPerimeter();
}
