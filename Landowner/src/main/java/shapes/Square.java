package shapes;

public class Square implements Shape{
    private final double length;
    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}
