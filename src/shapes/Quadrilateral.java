package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getLength() {
        return this.length;
    }
    double getWidth() {
        return this.width;
    }
    abstract void setLength(double length);
    abstract void setWidth(double width);
}
