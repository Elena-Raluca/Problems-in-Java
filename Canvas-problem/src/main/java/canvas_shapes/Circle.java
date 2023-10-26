package canvas_shapes;

public class Circle extends Shape {
    public Point circlePoint;
    public float radius;

    public Circle(float xCirclePoint, float yCirclePoint, float radius) {
        circlePoint = new Point(xCirclePoint, yCirclePoint);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("We draw the circle with the center with coordinates x= " + circlePoint.getX() + " and y=" + circlePoint.getY() +
                "and with the radius=" + radius);
    }
}
