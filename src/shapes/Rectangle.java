package shapes;

class Rectangle extends Quadrilateral implements Measurable {

    Rectangle(double length, double width) {
        super(length, width);
    }
    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
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
