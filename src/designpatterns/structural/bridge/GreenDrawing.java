package designpatterns.structural.bridge;

// Concrete Implementor 2 (GreenDrawing)
class GreenDrawing implements Drawing {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing green circle with radius " + radius);
    }

    @Override
    public void drawSquare(int side) {
        System.out.println("Drawing green square with side " + side);
    }
}
