package designpatterns.structural.bridge;

// Abstraction (Shape)
abstract class Shape {
    protected Drawing drawing;

    public Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    abstract void draw();
}
