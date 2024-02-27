package designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

// Object Structure
class ShapeCollection {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void acceptVisitor(ShapeVisitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
