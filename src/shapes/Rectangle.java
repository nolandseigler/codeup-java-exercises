package shapes;

public class Rectangle {
    protected int length;
    protected int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getPerimeter() {
        return 2 * this.length + 2 * width;
    }
    int getArea() {
        return this.length * this.width;
    }
}
