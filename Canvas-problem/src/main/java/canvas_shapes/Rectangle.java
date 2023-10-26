package canvas_shapes;

public class Rectangle extends Shape {
    public Point point1;
    public Point point2;
    public Point point3;
    public Point point4;

    public Rectangle(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);
        point4 = new Point(x4, y4);
    }

    public void draw() {
        System.out.println("We draw the rectangle with first point with x= " + point1.getX() + " and y=" + point1.getY() + " and " +
                "second point with x=" + point2.getX() + " and y=" + point2.getY() + " third point with x=" + point3.getX() + " and y=" + point3.getY() + " and fourth point" +
                "with x=" + point4.getX() + " and y=" + point4.getY());
    }

}
