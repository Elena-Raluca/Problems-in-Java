package canvas_shapes;

public class Line extends Shape {
    public Point firstPoint;
    public Point secondPoint;

    public Line(float xFirstPoint, float yFirstPoint, float xSecondPoint, float ySecondPoint) {
        firstPoint = new Point(xFirstPoint, yFirstPoint);
        secondPoint = new Point(xSecondPoint, ySecondPoint);
    }

    public void draw() {
        System.out.println("We draw the line with first point with x= " + firstPoint.getX() + " and y=" + firstPoint.getY() + " and " +
                "second point with x=" + secondPoint.getX() + " and y=" + secondPoint.getY());
    }
}
