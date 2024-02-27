package designpatterns.behavioral.visitor;

// Concrete Visitor
class AreaCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Calculating area of Circle");
        // Perform calculation logic for Circle
    }

    @Override
    public void visit(Square square) {
        System.out.println("Calculating area of Square");
        // Perform calculation logic for Square
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Calculating area of Rectangle");
        // Perform calculation logic for Rectangle
    }
}
