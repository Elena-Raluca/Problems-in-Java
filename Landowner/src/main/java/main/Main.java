package main;

import shapes.LandOwner;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Rectangle rectangle = new Rectangle(7, 5);
    Square square = new Square(10);
    ArrayList<Shape> shapes = new ArrayList<>();
    LandOwner landOwner = new LandOwner(shapes);

    landOwner.addShape(rectangle);
    landOwner.addShape(square);
    System.out.println("Total area of the shapes owned by the Landowner: " + landOwner.totalArea());

    landOwner.deleteLastShape();
        System.out.println("Total area of the shapes owned by the Landowner after deleting the last shape: " + landOwner.totalArea());
}
}
