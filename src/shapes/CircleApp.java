package shapes;

import util.Input;

public class CircleApp {
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
