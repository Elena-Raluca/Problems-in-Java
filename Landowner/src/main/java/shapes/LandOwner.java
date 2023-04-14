package shapes;

import java.util.ArrayList;

public class LandOwner {
    private double totalArea;
    private ArrayList<Shape> shapes;

    public LandOwner(ArrayList <Shape> shapes) {
        this.shapes=shapes;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void deleteLastShape() {
        shapes.remove(shapes.size()-1);
    }


    public double totalArea()
    {
        totalArea=0;
        for(int i=0;i<shapes.size();i++) {
            totalArea += shapes.get(i).area();
        }
        return totalArea;
    }
}
