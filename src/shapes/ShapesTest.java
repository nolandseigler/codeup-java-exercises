package shapes;

public class ShapesTest {

    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
        Rectangle myRectangle = new Rectangle(2.0, 3.0);
        Measurable mySquare = new Square(3.0);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
        System.out.println(mySquare.getArea());
        System.out.println(mySquare.getPerimeter());
        myRectangle.getLength();
        //below wont work because it is "Measurable" but should be "Quad or below" inheritance chain is important
//        mySquare.getLength();
    }
}
