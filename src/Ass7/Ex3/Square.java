package Ass7.Ex3;

class Square extends Rectangle{
    protected double side;
    public Square(){
        super();
//        side =
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color,filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }
    public void setLength(double side) {
        setSide(side);
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
