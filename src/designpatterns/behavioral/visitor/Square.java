package designpatterns.behavioral.visitor;

class Square implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
