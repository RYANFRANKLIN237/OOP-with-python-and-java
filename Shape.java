public class Shape {
    protected String shape;

    public Shape() {
        this.shape = "shape";
    }

    @Override
    public String toString() {
        return "I am a " + this.shape;
    }
}