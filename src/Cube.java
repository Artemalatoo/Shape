public class Cube implements Shape{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube (Side: " + side + ")";
    }
}
