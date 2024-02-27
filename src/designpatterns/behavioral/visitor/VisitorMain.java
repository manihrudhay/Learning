package designpatterns.behavioral.visitor;

public class VisitorMain {
    public static void main(String[] args) {
        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.addShape(new Circle());
        shapeCollection.addShape(new Square());
        shapeCollection.addShape(new Rectangle());

        ShapeVisitor areaCalculator = new AreaCalculator();
        shapeCollection.acceptVisitor(areaCalculator);
    }
}
