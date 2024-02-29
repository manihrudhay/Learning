package designpatterns.structural.bridge;

// Concrete Implementor 1 (RedDrawing)
class RedDrawing implements Drawing {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing red circle with radius " + radius);
    }

    @Override
    public void drawSquare(int side) {
        System.out.println("Drawing red square with side " + side);
    }
}
