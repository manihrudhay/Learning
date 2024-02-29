package designpatterns.structural.bridge;

// Refined Abstraction 2 (Square)
class Square extends Shape {
    private int side;

    public Square(Drawing drawing, int side) {
        super(drawing);
        this.side = side;
    }

    @Override
    void draw() {
        drawing.drawSquare(side);
    }
}
