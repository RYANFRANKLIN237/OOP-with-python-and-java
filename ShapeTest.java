public class ShapeTest {
    public static void main(String[] args) {
        // Creates an array of shapes
        Shape[] shapes = new Shape[3];

        // Adds shapes to the array
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 4, 3, 4, 5);

        // Displaying the results
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
