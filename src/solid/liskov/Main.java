package solid.liskov;

public class Main {

    //. It states that objects of a superclass should be replaceable with objects of its subclasses without
    // affecting the correctness of the program.
    //
    //In Java, this means that a subclass should be able to substitute its superclass without changing
    // the behavior of the program. This is achieved by ensuring that the subclass honors the contracts
    // established by its superclass.

    static void testShape(Shape shape) {
        int width = shape.getBreadth();
        shape.setLength(10);
        System.out.println("Expected area = " + (width * 10) + ", Actual area = ");
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        testShape(rectangle);

        Square square = new Square(5);
        testShape(square); // This now adheres to LSP
    }
}
