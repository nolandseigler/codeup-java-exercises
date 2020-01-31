package shapes;

import org.w3c.dom.ls.LSOutput;
import util.Input;

public class Circle {
    private double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        if (this.radius == 0.0) {
            System.out.println("No circle exists!");
            return 0.0;
        }
        return Math.PI * (this.radius * this.radius);
    }
    public double getCircumference() {
        if (this.radius == 0.0) {
            System.out.println("No circle exists!");
            return 0.0;
        }
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Circle circle1 = makeCircle();
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
        Circle circle2 = makeCircle();
        System.out.println(circle2.getArea());
        System.out.println(circle2.getCircumference());

    }
    public static Circle makeCircle() {
        Input myScanner = new Input();
        double radius = 0;
        while (true) {
            System.out.println("Create a circle?\n");
            if (myScanner.yesNo()) {
//
                radius = (myScanner.getDouble("Input a radius for your new circle!\n"));
            } else {
                break;
            }
        }
        if (radius > 0) {
            return new Circle(radius);
        } else {
            return new Circle();
        }
    }
}
