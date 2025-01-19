public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println(s);

        Polygon p = new Polygon();
        System.out.println(p);

        Rectangle rect = new Rectangle();
        System.out.println(rect);
        System.out.println(rect.computePerimeter()); 

        Triangle tri = new Triangle();
        System.out.println(tri);
        System.out.println(tri.computePerimeter()); 
    }
}
