package designpatterns.behavioral.visitor;

// Concrete Elements
class Circle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
