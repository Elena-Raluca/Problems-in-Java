package main;

import canvas_shapes.*;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas(1);
        Point point = new Point(70, 90);
        Line line = new Line(1, 2, 3, 4);
        Circle circle = new Circle(11, 12, 7);
        canvas.addShape(point);
        canvas.addShape(line);
        canvas.addShape(circle);
        canvas.draw();

        Canvas mainCanvas = new Canvas(0);
        mainCanvas.addShape(canvas);
        mainCanvas.addShape(new Rectangle(18, 19, 20, 21, 38, 39, 43, 45));
        mainCanvas.draw();


    }
}
