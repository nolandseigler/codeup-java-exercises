package shapes;

import org.w3c.dom.ls.LSOutput;
import util.Input;

public class Circle {
    private double radius;
    private static int circlesCreated = 0;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
        circlesCreated++;
    }
    public static int getCirclesCreated() {
        return circlesCreated;
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
}
