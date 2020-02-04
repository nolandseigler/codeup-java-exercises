package shapes;

public class Square extends Rectangle {

    Square(int side) {
        super(side, side);
    }
    int getPerimeter() {
        return 4 * this.length;
    }
    int getArea() {
        return this.length * this.length;
    }
}
