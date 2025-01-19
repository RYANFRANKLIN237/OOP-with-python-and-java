public class Polygon extends Shape  {
    protected int[] sideLengths;

    public Polygon() {
        super();
        this.shape = "polygon";
        this.sideLengths = null;
    }
    
    public int computePerimeter() {
        if (this.sideLengths == null) {
            return 0;
        }
        int perimeter = 0;
        for (int length : this.sideLengths) {
            perimeter += length;
        }
        return perimeter;
    }

    public int getNumberOfEdges() {
        if (this.sideLengths == null) {
            return 0;
        }
        return this.sideLengths.length;
    }
}
