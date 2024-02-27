package designpatterns.behavioral.visitor;

// Element Interface
interface Shape {
    void accept(ShapeVisitor visitor);
}
