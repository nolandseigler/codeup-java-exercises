package shapes;

class Square extends Quadrilateral {

    Square(double side) {
        super(side, side);
    }
    @Override
    void setLength(double length) {
      this.length = length;
      this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
