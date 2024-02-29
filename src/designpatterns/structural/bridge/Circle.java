package designpatterns.structural.bridge;

// Refined Abstraction 1 (Circle)
class Circle extends Shape {
    private int radius;

    public Circle(Drawing drawing, int radius) {
        super(drawing);
        this.radius = radius;
    }

    @Override
    void draw() {
        drawing.drawCircle(radius);
    }
}
