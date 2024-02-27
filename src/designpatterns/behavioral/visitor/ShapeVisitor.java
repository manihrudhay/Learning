package designpatterns.behavioral.visitor;

// Visitor Interface
interface ShapeVisitor {
    void visit(Circle circle);

    void visit(Square square);

    void visit(Rectangle rectangle);
}
