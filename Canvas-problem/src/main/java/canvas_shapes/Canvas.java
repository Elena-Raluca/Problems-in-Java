package canvas_shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas extends Shape {
    List<Shape> shapes = new ArrayList<>();
    private final int index;

    public Canvas(int index) {
        this.index = index;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void draw() {
        System.out.println("Draw Canvas: " + index);
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}