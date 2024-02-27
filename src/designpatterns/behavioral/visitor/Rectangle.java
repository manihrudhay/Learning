package designpatterns.behavioral.visitor;

class Rectangle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
